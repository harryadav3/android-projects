package com.example.etpprac

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.widget.Toast
import com.example.etpprac.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var user = binding.user.text
        var pass = binding.pass.text
        var btn = binding.logintbn

        btn.setOnClickListener {
//            Log.d("checking log", "$user + $pass")
            if (user.toString() == "test" && pass.toString() == "enter"){
                Toast.makeText(this, "Welcome test", Toast.LENGTH_SHORT).show()
                startActivity(Intent(this, MainActivity2::class.java))
            } else {
                Toast.makeText(this, "Invalid Login", Toast.LENGTH_SHORT).show()
            }
        }
    }
}