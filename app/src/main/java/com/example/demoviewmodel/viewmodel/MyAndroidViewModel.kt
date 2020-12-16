package com.example.demoviewmodel.viewmodel

import android.app.Application
import android.util.Log
import androidx.lifecycle.AndroidViewModel

class MyAndroidViewModel(application: Application) : AndroidViewModel(application) {

    init {
        Log.d("abba", "create my android viewmodel ")
    }



}