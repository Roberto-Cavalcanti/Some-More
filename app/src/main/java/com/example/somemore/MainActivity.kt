package com.example.somemore

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.somemore.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnSomar.setOnClickListener { somar() }
    }

    private fun somar(){
        var n1 = binding.editTextNumber.text.toString().toFloat()
        var n2 = binding.editTextNumber2.text.toString().toFloat()
        val intent = Intent(this, ResultScreen::class.java)
        var soma = n1 + n2;
        var resultado = "$soma";
        intent.putExtra("result", resultado)
//        intent.putExtra("result", resultado);
        startActivity(intent)
    }

}


