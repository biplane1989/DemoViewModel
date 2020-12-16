package com.example.demoviewmodel.viewmodel

import android.content.Context
import android.util.Log
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel

class SavedStateViewModel(private val savedStateHandle: SavedStateHandle) : ViewModel() {

    val SAVED_KEY_TEXT_VALUE = "KEY"
    var text = ""

    init {
        Log.d("abba", "create saved state viewmodel")
        Log.d("abba", "text value: ${savedStateHandle.get<String>(SAVED_KEY_TEXT_VALUE)}")
        savedStateHandle.get<String>(SAVED_KEY_TEXT_VALUE)?.let {
            text = it
        }
    }

    fun addText(text: String) {
        this.text = String.format("%s-%s", this.text, text)
        savedStateHandle.set(SAVED_KEY_TEXT_VALUE, this.text)
    }

    override fun onCleared() {
        super.onCleared()
        Log.d("abba", "onCleared saved state viewmodel ")
    }

}