package com.example.demoviewmodel

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.lifecycle.SavedStateViewModelFactory
import androidx.lifecycle.ViewModelProvider
import com.example.demoviewmodel.viewmodel.MainViewModel
import com.example.demoviewmodel.viewmodel.MyViewModel2
import com.example.demoviewmodel.viewmodel.MyViewModelFactory

class MainActivity : AppCompatActivity() {

    lateinit var viewModel: MainViewModel
    private lateinit var button: Button;
    private lateinit var editText: EditText;
    private lateinit var tvValue: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d("abba", "onCreate: ")
        viewModel = ViewModelProvider(this,SavedStateViewModelFactory(application,this)).get(MainViewModel::class.java)

        val viewmodel2 = ViewModelProvider(this,MyViewModelFactory(5)).get(MyViewModel2::class.java)

        button = findViewById(R.id.button)
        editText = findViewById(R.id.edittext)
        tvValue = findViewById(R.id.tv_value)

        button.setOnClickListener {
            if(editText.text.isNotEmpty()){
                tvValue.text = tvValue.text.toString() + " | " +editText.text
                viewModel.addText(tvValue.text.toString())
            }
        }

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