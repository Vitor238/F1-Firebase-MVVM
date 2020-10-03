package com.vitor238.f1drivers

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var driversAdapter: DriversAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        driversAdapter = DriversAdapter(this)

        recycler_drivers.layoutManager = LinearLayoutManager(this)
        recycler_drivers.adapter = driversAdapter
        recycler_drivers.setHasFixedSize(true)

        val dummyList = mutableListOf<Driver>()
        dummyList.add(
            Driver(
                "Lewis Hamilton",
                "Mercedes",
                "https://www.formula1.com/content/fom-website/en/drivers/lewis-hamilton/_jcr_content/image.img.1024.medium.jpg/1593685990514.jpg"
            )
        )
        dummyList.add(
            Driver(
                "Valtteri Bottas",
                "Mercedes",
                "https://www.formula1.com/content/fom-website/en/drivers/valtteri-bottas/_jcr_content/image.img.1024.medium.jpg/1593686052056.jpg"
            )
        )
        dummyList.add(
            Driver(
                "Max Verstappen",
                "Red Bull Racing",
                "https://www.formula1.com/content/fom-website/en/drivers/max-verstappen/_jcr_content/image.img.1024.medium.jpg/1584012927837.jpg"
            )
        )


        driversAdapter.setListData(dummyList)
        driversAdapter.notifyDataSetChanged()
    }
}