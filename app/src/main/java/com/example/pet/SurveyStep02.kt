package com.example.pet

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.pet.databinding.ActivitySurveyStep02Binding

class SurveyStep02 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivitySurveyStep02Binding.inflate(layoutInflater)
        setContentView(binding.root)

    }
}