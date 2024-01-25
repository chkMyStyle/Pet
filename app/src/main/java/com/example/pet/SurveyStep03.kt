package com.example.pet

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.ToggleButton
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import com.example.pet.databinding.ActivitySurveyStep03Binding

class SurveyStep03 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivitySurveyStep03Binding.inflate(layoutInflater)
        setContentView(binding.root)

        val backButtonStep03 = binding.imageButtonBackStep03
        backButton(backButtonStep03)

        val toggleButton1Step03 = binding.toggleButton1Step03
        val toggleButton2Step03 = binding.toggleButton2Step03
        val toggleButton3Step03 = binding.toggleButton3Step03
        val toggleButton4Step03 = binding.toggleButton4Step03
        val toggleButton5Step03 = binding.toggleButton5Step03
        val toggleButton6Step03 = binding.toggleButton6Step03
        val toggleButton7Step03 = binding.toggleButton7Step03
        val toggleButton8Step03 = binding.toggleButton8Step03
        val toggleButton9Step03 = binding.toggleButton9Step03
        val toggleButton10Step03 = binding.toggleButton10Step03
        val toggleButton11Step03 = binding.toggleButton11Step03
        val toggleButton12Step03 = binding.toggleButton12Step03

        toggleButton(toggleButton1Step03)
        toggleButton(toggleButton2Step03)
        toggleButton(toggleButton3Step03)
        toggleButton(toggleButton4Step03)
        toggleButton(toggleButton5Step03)
        toggleButton(toggleButton6Step03)
        toggleButton(toggleButton7Step03)
        toggleButton(toggleButton8Step03)
        toggleButton(toggleButton9Step03)
        toggleButton(toggleButton10Step03)
        toggleButton(toggleButton11Step03)
        toggleButton(toggleButton12Step03)
    }

    fun toggleButton(view: ToggleButton) {
        view.setOnClickListener {
            if (view.isChecked) {
                view.background = ContextCompat.getDrawable(this, R.drawable.choose_active_button)
                val textColor =
                    ContextCompat.getColorStateList(this, R.color.color_text_toggle_button_active)
                view.setTextColor(textColor)
            } else {
                view.background = ContextCompat.getDrawable(this, R.drawable.choose_no_active_bar)
                val textColor = ContextCompat.getColorStateList(
                    this,
                    R.color.color_text_toggle_button_no_active
                )
                view.setTextColor(textColor)
            }
        }
    }

    fun backButton(backButton: View) {
        backButton.setOnClickListener {
            val intent = Intent(this, SurveyStep02::class.java)
            startActivity(intent)
        }
    }
}