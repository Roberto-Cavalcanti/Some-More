package com.example.somemore

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.somemore.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    val btnSomar = binding.btnSomar
    val editTextNumber = binding.editTextNumber
    val editTextNumber2 = binding.editTextNumber2

//    btnSomar.setOnClickListener{
//
//    }

    private fun somar(n1: Float, n2:Float): Float{
        var resultado = n1 + n2;
        return resultado;
    }

}