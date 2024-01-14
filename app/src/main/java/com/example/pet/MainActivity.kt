package com.example.pet

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonNexScreen = findViewById<Button>(R.id.buttonContinue)
        buttonNexScreen.setOnClickListener {
            val intent = Intent(this, BornActivity::class.java)
            startActivity(intent)
        }
    }
}