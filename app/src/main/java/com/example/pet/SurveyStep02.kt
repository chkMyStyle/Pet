package com.example.pet

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.pet.databinding.ActivitySurveyStep02Binding

class SurveyStep02 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivitySurveyStep02Binding.inflate(layoutInflater)
        setContentView(binding.root)

        val backButtonStep02 = binding.imageButtonBackStep02
        backButtonStap02(backButtonStep02)

    }

    fun backButtonStap02(backButtonStep02: View){
        backButtonStep02.setOnClickListener{
            val intent = Intent(this, SurveyStep01::class.java)
            startActivity(intent)
        }

    }
}