package com.vitor238.f1drivers.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.vitor238.f1drivers.Driver
import com.vitor238.f1drivers.domain.data.network.Repository

class DriversViewModel : ViewModel() {

    private val repository = Repository()
    fun fetchDriversData(): LiveData<MutableList<Driver>> {
        val mutableData = MutableLiveData<MutableList<Driver>>()
        repository.getDriverData().observeForever { driversList ->
            mutableData.value = driversList
        }
        return mutableData
    }

}