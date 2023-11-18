package com.example.register

import android.content.Intent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val button = findViewById<Button>(R.id.btn1)
        button.setOnClickListener {
            val username = findViewById<EditText>(R.id.text1).text.toString()
            val password = findViewById<EditText>(R.id.password).text.toString()

            if (username.isBlank() or password.isBlank()) {
                Toast.makeText(this, "Please enter valid details", Toast.LENGTH_LONG).show()
            } else {
                Toast.makeText(this, "Registration successful", Toast.LENGTH_LONG).show()

                val intent = Intent(this, MainActivity2::class.java).apply {
                    putExtra("username", username)
                    putExtra("password", password)
                }
                startActivity(intent)
            }
        }
    }
}