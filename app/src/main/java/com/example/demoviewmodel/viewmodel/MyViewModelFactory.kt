package com.example.demoviewmodel.viewmodel

import android.content.Context
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import java.lang.IllegalArgumentException

class MyViewModelFactory(private val number:Int) : ViewModelProvider.Factory {

    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(MyViewModel2::class.java)) {
            return MyViewModel2(number) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}