package com.vitor238.f1drivers

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.item_row.view.*

class DriversAdapter(private val context: Context) :
    RecyclerView.Adapter<DriversAdapter.ViewHolder>() {

    private var driversList = mutableListOf<Driver>()

    fun setListData(data: MutableList<Driver>) {
        driversList = data
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.item_row, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val driver = driversList[position]
        holder.bind(driver)
    }

    override fun getItemCount(): Int {
        return if (driversList.size > 0) {
            driversList.size
        } else {
            0
        }
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        val photo: ImageView = itemView.image_photo
        val name: TextView = itemView.text_name
        val team: TextView = itemView.text_team

        fun bind(driver: Driver) {
            Glide.with(context).load(driver.photoUrl).circleCrop().into(photo)
            name.text = driver.name
            team.text = driver.team
        }
    }
}