package com.example.ermayuni.penghitungbangunruang

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.ermayuni.penghitungbangunruang.databinding.ActivityMainBinding
import kotlin.math.PI

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnCalculate.setOnClickListener {
            calculateVolume()
        }
    }

    private fun calculateVolume() {
        val radiusInput = binding.etRadius.text.toString()
        val heightInput = binding.etHeight.text.toString()

        if (radiusInput.isEmpty() || heightInput.isEmpty()) {
            Toast.makeText(this, "Masukkan jari-jari dan tinggi", Toast.LENGTH_SHORT).show()
            return
        }

        val radius = radiusInput.toDouble()
        val height = heightInput.toDouble()

        // Rumus volume tabung: V = π * r² * h
        val volume = PI * radius * radius * height


        binding.tvResult.text = "Volume Tabung: %.2f".format(volume)
    }
}