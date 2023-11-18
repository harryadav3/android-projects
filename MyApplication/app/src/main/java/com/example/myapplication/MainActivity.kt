package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val input1 = findViewById<EditText>(R.id.inp1);
        val  input2 = findViewById<EditText>(R.id.inp2);



        val testView : View = this.findViewById(R.id.test1);
        testView.setOnClickListener {
            Toast.makeText(this, input1.text.toString() +" " +  input2.text.toString(), Toast.LENGTH_SHORT).show()
        }

            var button1 = findViewById<Button>(R.id.btn1);
        button1.setOnClickListener {
            startActivity(Intent(this, gallery::class.java))
        }



    }
}