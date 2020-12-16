package com.example.demoviewmodel

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d("abba", "onCreate: Main activity")
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        Log.d("abba", "onRestoreInstanceState: ")
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        Log.d("abba", "onSaveInstanceState: ")
    }

    override fun finish() {
        super.finish()
        Log.d("abba", "finish: ")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("abba", "onDestroy: ")
    }

}