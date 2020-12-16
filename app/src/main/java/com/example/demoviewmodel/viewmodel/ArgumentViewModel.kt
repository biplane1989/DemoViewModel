package com.example.demoviewmodel.viewmodel

import android.util.Log
import androidx.lifecycle.ViewModel

class ArgumentViewModel(val title: String) : ViewModel() {

    init {
        Log.d("abba", "created argument viewmodel. title: ${title} ")
    }

}