package com.vitor238.f1drivers.domain.data.network

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.google.firebase.firestore.FirebaseFirestore
import com.vitor238.f1drivers.Driver

class Repository {

    fun getDriverData(): LiveData<MutableList<Driver>> {
        val mutableData = MutableLiveData<MutableList<Driver>>()

        FirebaseFirestore.getInstance().collection("drivers").get().addOnSuccessListener { result ->
            val listData = mutableListOf<Driver>()
            Log.i("repo", "called")
            for (document in result) {

                val photoUrl = document.getString("photoUrl")!!
                val name = document.getString("name")!!
                val team = document.getString("team")!!
                Log.i("repo", "${document.id}} => ${document.data}")
                val driver = Driver(name, team, photoUrl)
                listData.add(driver)
            }
            mutableData.value = listData
        }.addOnFailureListener {
            Log.i("repo", "getDriverData: ${it.message}")
        }
        return mutableData
    }
}