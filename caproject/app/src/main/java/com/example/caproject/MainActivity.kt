package com.example.caproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Button for electric cars
        val carButton: Button = findViewById(R.id.car_button)
        carButton.setOnClickListener {
            startActivity(Intent(this, ListActivity::class.java).apply {
                putExtra("type", "car")
            })
        }

        // Button for electric bikes
        val bikeButton: Button = findViewById(R.id.bike_button)
        bikeButton.setOnClickListener {
            startActivity(Intent(this, ListActivity::class.java).apply {
                putExtra("type", "bike")
            })
        }
    }
}
