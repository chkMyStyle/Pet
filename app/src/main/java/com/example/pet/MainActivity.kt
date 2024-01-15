package com.example.pet

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import com.example.pet.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val buttonNexScreen = binding.buttonContinue
        nextScreenButton(buttonNexScreen)

        val checkBoxRegister = binding.checkBoxRegister
        checkBoxRegister.setOnCheckedChangeListener { buttonView, isChecked ->
            if(!isChecked){
                buttonNexScreen.isEnabled = false
                Toast.makeText(this,"Нужно принять соглашение",Toast.LENGTH_SHORT).show()
            }else{
                buttonNexScreen.isEnabled = true
            }
        }

    }

    fun nextScreenButton(buttonNexScreen: View) {
        buttonNexScreen.setOnClickListener {
            val intent = Intent(this, BornActivity::class.java)
            startActivity(intent)
        }
    }



}