package com.example.asc_sorting

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.RadioButton
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        val button1 = findViewById<Button>(R.id.btn1)
        button1.setOnClickListener {
            Toast.makeText(this, "You clicked  button", Toast.LENGTH_LONG).show()

            startActivity(Intent(this, MainActivity2::class.java))
        }


        val imagebtn = findViewById<ImageButton>(R.id.image_button)
        imagebtn.setOnClickListener {
            Toast.makeText(this, "You clicked Image button", Toast.LENGTH_SHORT).show()

        }

        val radioButton = findViewById<RadioButton>(R.id.radio_button)

        radioButton.setOnCheckedChangeListener { compoundButton, isChecked ->
            if (isChecked) {
                Toast.makeText(applicationContext, "Radio button is checked", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(applicationContext, "Radio button is unchecked", Toast.LENGTH_SHORT).show()
            }
        }
    }
}