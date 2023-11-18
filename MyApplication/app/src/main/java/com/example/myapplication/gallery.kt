package com.example.myapplication

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.RadioButton
import android.widget.TextView
import android.widget.Toast
import kotlin.random.Random

class gallery : AppCompatActivity() {

    var  hints = arrayOf( "Mr. 360 ", "Slim Shady", "Hermione Granger" );
    var answer = arrayOf("Ab Develliers","Eminem","Emma Watson")



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_gallery)


        var radioOne = findViewById<RadioButton>(R.id.radio1);
        var radioTwo = findViewById<RadioButton>(R.id.radio2);
        var radioThree = findViewById<RadioButton>(R.id.radio3);
        var guessbox = findViewById<TextView>(R.id.guess);
        var checkButton = findViewById<Button>(R.id.button2)

        val rand  = Random.nextInt(0,3);
        guessbox.text = hints[rand];

        var correctanswer = answer[rand];
        checkButton.setOnClickListener {

            if ( radioOne.isChecked && ( rand == 0 ) ) {
                Toast.makeText(this, "Correct An swer", Toast.LENGTH_SHORT).show()

            }
            else if ( radioTwo.isChecked && ( rand == 1) ) {
                Toast.makeText(this, "Correct An swer", Toast.LENGTH_SHORT).show()

            }
            else if ( radioThree.isChecked && ( rand == 2 ) ) {
                Toast.makeText(this, "Correct An swer", Toast.LENGTH_SHORT).show()

            }
            else {
                Toast.makeText(this, "Incorrect ", Toast.LENGTH_LONG).show();
            }
        }


    }

    private var hintIndex: Int = -1

}