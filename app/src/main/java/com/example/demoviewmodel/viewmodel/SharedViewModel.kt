package com.example.demoviewmodel.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class SharedViewModel : ViewModel() {

    val liveData = MutableLiveData<Int>()
    var i = 0

    init {
        viewModelScope.launch {
            while (true) {
                delay(1000)
                liveData.value = i++
            }
        }
    }

    fun getLiveData(): LiveData<Int> {
        return liveData
    }

}