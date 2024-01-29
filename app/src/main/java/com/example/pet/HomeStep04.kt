package com.example.pet

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.pet.databinding.ActivityHomeStep04Binding

class HomeStep04 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityHomeStep04Binding.inflate(layoutInflater)
        setContentView(binding.root)

    }
}