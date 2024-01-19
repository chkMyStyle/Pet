package com.example.pet

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.app.AppCompatDelegate
import androidx.appcompat.app.AppCompatDelegate.MODE_NIGHT_NO
import androidx.appcompat.app.AppCompatDelegate.MODE_NIGHT_YES
import androidx.core.content.ContextCompat
import com.example.pet.databinding.ActivitySurveyStep02Binding

class SurveyStep02 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivitySurveyStep02Binding.inflate(layoutInflater)
        setContentView(binding.root)

        val backButtonStep02 = binding.imageButtonBackStep02
        val buttonChangeColor = binding.buttonChangeColor

        var isToggle = false
        buttonChangeColor.background =
            ContextCompat.getDrawable(this, R.drawable.choose_no_active_bar)

        backButtonStap02(backButtonStep02)


        buttonChangeColor.setOnClickListener {
            isToggle = !isToggle
            if (isToggle) {
                buttonChangeColor.background =
                    ContextCompat.getDrawable(this, R.drawable.choose_active_button)
                Log.d("MyApp", "Фон кнопки изменен на активный")
            } else {
                buttonChangeColor.background =
                    ContextCompat.getDrawable(this, R.drawable.choose_no_active_bar)
                Log.d("MyApp", "Фон кнопки изменен на неактивный")
            }
        }
    }

    fun backButtonStap02(backButtonStep02: View) {
        backButtonStep02.setOnClickListener {
            val intent = Intent(this, SurveyStep01::class.java)
            startActivity(intent)
        }

    }
}

//        buttonChangeColor.backgroundTintList =
//            ContextCompat.getColorStateList(this, R.color.color_no_active_button)