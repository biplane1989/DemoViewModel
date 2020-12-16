package com.example.demoviewmodel.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import java.lang.IllegalArgumentException

class MyViewModelFactory(private val text:String) : ViewModelProvider.Factory {

    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(ArgumentViewModel::class.java)) {
            return ArgumentViewModel(text) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}