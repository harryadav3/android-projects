package com.example.caproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class madamsolution : AppCompatActivity() {
    lateinit var b: Button;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_madamsolution)

        b= findViewById(R.id.btn1)

        b.setOnClickListener{
            startActivity(Intent(this, madam2::class.java))
            overridePendingTransition(R.anim.zoomin,R.anim.zoomout)
        }
    }
}