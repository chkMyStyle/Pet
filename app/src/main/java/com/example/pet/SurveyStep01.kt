package com.example.pet

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.pet.databinding.ActivitySurveyStep01Binding

class SurveyStep01 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivitySurveyStep01Binding.inflate(layoutInflater)
        setContentView(binding.root)

        val backButton = binding.backButton
        backButtonClick(backButton)
    }

    fun backButtonClick(backButton: View) {
        backButton.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}