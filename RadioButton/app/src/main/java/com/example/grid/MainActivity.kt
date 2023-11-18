package com.example.grid

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val group = findViewById<RadioGroup>(R.id.rdgrp)
        val button=findViewById<RadioButton>(R.id.cheese)
        val button2=findViewById<RadioButton>(R.id.potato)
        val button3=findViewById<RadioButton>(R.id.tomato)

        button.setOnClickListener{
            Toast.makeText(this,"You clicked cheese" , Toast.LENGTH_LONG).show()

        }
        button2.setOnClickListener{
            Toast.makeText(this,"You clicked potato" , Toast.LENGTH_LONG).show()

        }
        button3.setOnClickListener(){
            Toast.makeText(this,"You clicked tomato" , Toast.LENGTH_LONG).show()
        }

    }
}