package com.example.pet

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val buttonNexScreen = findViewById<Button>(R.id.buttonContinue)
        nextScreenButton(buttonNexScreen)

    }

    fun nextScreenButton(buttonNexScreen: View) {
        buttonNexScreen.setOnClickListener {
            val intent = Intent(this, BornActivity::class.java)
            startActivity(intent)
        }
    }


}