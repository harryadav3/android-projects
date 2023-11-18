package com.example.ca_2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


       var userIdEditText = findViewById<EditText>(R.id.userIdEditText)
       var  passwordEditText = findViewById<EditText>(R.id.passwordEditText)
      var   dateOfBirthEditText = findViewById<EditText>(R.id.dateOfBirthEditText)
       var  addressEditText = findViewById<EditText>(R.id.addressEditText)
      var  pincodeEditText = findViewById<EditText>(R.id.pincodeEditText)
       var  eventNameEditText = findViewById<EditText>(R.id.eventNameEditText)
       var submitButton = findViewById<Button>(R.id.submitButton)
      var  clearButton = findViewById<Button>(R.id.clearButton)

        submitButton.setOnClickListener {
            Toast.makeText(this, "Registration page submitted successfully", Toast.LENGTH_SHORT).show()
        }

        clearButton.setOnClickListener {
            userIdEditText.text.clear()
            passwordEditText.text.clear()
            dateOfBirthEditText.text.clear()
            addressEditText.text.clear()
            pincodeEditText.text.clear()
            eventNameEditText.text.clear()
        }




    }
}