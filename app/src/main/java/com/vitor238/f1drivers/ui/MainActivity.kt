package com.vitor238.f1drivers.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.vitor238.f1drivers.DriversAdapter
import com.vitor238.f1drivers.R
import com.vitor238.f1drivers.viewmodel.DriversViewModel
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var driversAdapter: DriversAdapter
    private val viewModel by lazy { ViewModelProvider(this).get(DriversViewModel::class.java) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        driversAdapter = DriversAdapter(this)

        recycler_drivers.layoutManager = LinearLayoutManager(this)
        recycler_drivers.adapter = driversAdapter
        recycler_drivers.setHasFixedSize(true)
        observeData()
    }

    private fun observeData() {
        viewModel.fetchDriversData().observe(this, {
            driversAdapter.setListData(it)
            driversAdapter.notifyDataSetChanged()
        })
    }
}