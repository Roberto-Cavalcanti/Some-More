package com.example.somemore

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.somemore.databinding.ActivityResultScreenBinding

class ResultScreen : AppCompatActivity() {

    private lateinit var binding: ActivityResultScreenBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityResultScreenBinding.inflate(layoutInflater)
        setContentView(binding.root)
        printResult()
    }

    private fun printResult(){
        val resultado = intent.getStringExtra("result")
        binding.resultSoma.setText(resultado)
    }

}