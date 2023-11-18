package com.example.register

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)


        val username = intent.getStringExtra("username")
        val welcomeMessage = "Hello $username"

        val textView = findViewById<TextView>(R.id.textViewWelcome)
        textView.text = welcomeMessage


    }
}