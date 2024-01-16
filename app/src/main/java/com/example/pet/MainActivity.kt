package com.example.pet

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.CheckBox
import android.widget.Toast
import com.example.pet.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val buttonNexScreen = binding.buttonContinue
        val checkBoxRegister = binding.checkBoxRegister

        nextScreenButton(buttonNexScreen, checkBoxRegister)

    }

    fun nextScreenButton(buttonNexScreen: View, checkBoxRegister: CheckBox) {
        buttonNexScreen.setOnClickListener {
            if (!checkBoxRegister.isChecked) {
                Toast.makeText(this, "Подтвердите соглашение", Toast.LENGTH_SHORT).show()
            } else {
                val intent = Intent(this, SurveyStep01::class.java)
                startActivity(intent)
            }
        }
    }

}