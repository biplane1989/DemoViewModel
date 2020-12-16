package com.example.demoviewmodel.viewmodel

import android.content.Context
import android.util.Log
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel

class MainViewModel(private val savedStateHandle: SavedStateHandle) : ViewModel() {

    val SAVED_KEY_TEXT_VALUE = "KEY"

    init {
        Log.d("abba", "create my viewmodel")
        Log.d("abba", "text value: ${savedStateHandle.get<String>(SAVED_KEY_TEXT_VALUE)}")
    }

    fun addText(text:String){
        savedStateHandle.set(SAVED_KEY_TEXT_VALUE,text)
    }

    override fun onCleared() {
        super.onCleared()
        Log.d("abba", "onCleared my viewmodel ")
    }

}