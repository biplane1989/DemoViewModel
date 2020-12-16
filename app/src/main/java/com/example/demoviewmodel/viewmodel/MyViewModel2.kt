package com.example.demoviewmodel.viewmodel

import android.util.Log
import androidx.lifecycle.ViewModel

class MyViewModel2(val number:Int) : ViewModel() {

    init {
        Log.d("abba", "create viewmodel 2: $number")
    }

}