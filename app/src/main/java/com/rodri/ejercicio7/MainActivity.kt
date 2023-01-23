package com.rodri.ejercicio7

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.rodri.ejercicio7.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.imagen.setBackgroundResource(R.drawable.inicio)

        binding.magoBtn.setOnClickListener {
            binding.imagen.setBackgroundResource(R.drawable.mago)
            if(!binding.aceptarBtn.isEnabled)
                binding.aceptarBtn.isEnabled = true
        }

        binding.ladronBtn.setOnClickListener {
            binding.imagen.setBackgroundResource(R.drawable.ladron)
            if(!binding.aceptarBtn.isEnabled)
                binding.aceptarBtn.isEnabled = true
        }

        binding.guerreroBtn.setOnClickListener {
            binding.imagen.setBackgroundResource(R.drawable.guerrero)
            if(!binding.aceptarBtn.isEnabled)
                binding.aceptarBtn.isEnabled = true
        }

        binding.berserkerBtn.setOnClickListener {
            binding.imagen.setBackgroundResource(R.drawable.berserker)
            if(!binding.aceptarBtn.isEnabled)
                binding.aceptarBtn.isEnabled = true
        }

        binding.mercaderBtn.setOnClickListener {
            binding.imagen.setBackgroundResource(R.drawable.mercader)
            if(!binding.aceptarBtn.isEnabled)
                binding.aceptarBtn.isEnabled = true
        }

        binding.aceptarBtn.setOnClickListener {
            startActivity(Intent(this, MainActivity2::class.java))
        }
    }
}