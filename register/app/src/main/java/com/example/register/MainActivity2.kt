package com.example.register

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)



        val button = findViewById<Button>(R.id.btn2)
        button.setOnClickListener {
            val username = intent.getStringExtra("username")
            val password = intent.getStringExtra("password")

            val inputUsername = findViewById<EditText>(R.id.editTextUsername).text.toString()
            val inputPassword = findViewById<EditText>(R.id.editTextPassword).text.toString()

            if (inputUsername == username && inputPassword == password) {
                val intent = Intent(this, MainActivity3::class.java).apply {
                    putExtra("username", username)
                }
                startActivity(intent)
            } else {
                Toast.makeText(this, "Invalid credentials", Toast.LENGTH_LONG).show()
            }
        }
    }
}