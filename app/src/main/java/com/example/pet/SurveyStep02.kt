package com.example.pet

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.ToggleButton
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import com.example.pet.databinding.ActivitySurveyStep02Binding
import com.example.pet.databinding.FragmentYearOfBirthBinding

class SurveyStep02 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivitySurveyStep02Binding.inflate(layoutInflater)
        setContentView(binding.root)

        val backButtonStep02 = binding.imageButtonBackStep02
        val buttonContinue = binding.buttonContinueStep02

        val buttonToggleClick1 = binding.toggleButton1Step02
        val buttonToggleClick2 = binding.toggleButton2Step02
        val buttonToggleClick3 = binding.toggleButton3Step02
        val buttonToggleClick4 = binding.toggleButton4Step02
        val buttonToggleClick5 = binding.toggleButton5Step02
        val buttonToggleClick6 = binding.toggleButton6Step02
        val buttonToggleClick7 = binding.toggleButton7Step02
        val buttonToggleClick8 = binding.toggleButton8Step02

        backButtonStep02(backButtonStep02)
        buttoContinue(buttonContinue)

        buttonClick(buttonToggleClick1)
        buttonClick(buttonToggleClick2)
        buttonClick(buttonToggleClick3)
        buttonClick(buttonToggleClick4)
        buttonClick(buttonToggleClick5)
        buttonClick(buttonToggleClick6)
        buttonClick(buttonToggleClick7)
        buttonClick(buttonToggleClick8)
    }

    fun buttonClick(toggleButton: ToggleButton) {
        toggleButton.setOnClickListener {
            if (toggleButton.isChecked) {
                toggleButton.background =
                    ContextCompat.getDrawable(this, R.drawable.choose_active_button)
                val textColor =
                    ContextCompat.getColorStateList(this, R.color.color_text_toggle_button_active)
                toggleButton.setTextColor(textColor)
            } else {
                toggleButton.background =
                    ContextCompat.getDrawable(this, R.drawable.choose_no_active_bar)
                val textColor = ContextCompat.getColorStateList(
                    this,
                    R.color.color_text_toggle_button_no_active
                )
                toggleButton.setTextColor(textColor)
            }
        }
    }

    fun buttoContinue(buttonContinue: View) {
        buttonContinue.setOnClickListener {
            val intent = Intent(this, SurveyStep03::class.java)
            startActivity(intent)
        }
    }

    fun backButtonStep02(backButtonStep02: View) {
        backButtonStep02.setOnClickListener {
            val intent = Intent(this, FragmentYearOfBirthBinding::class.java)
            startActivity(intent)
        }
    }
}