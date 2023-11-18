package com.example.endtermexam

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AlertDialog

class home_activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val message = intent.getStringExtra("EXTRA_MESSAGE")

        val textView = findViewById<TextView>(R.id.text1).apply {
            text = message
        }




        // This is Dailog box


        val button: Button = findViewById(R.id.show_dialog_button)

        button.setOnClickListener {
            val builder = AlertDialog.Builder(this)
                .setTitle("Dialog Title")
                .setMessage("This is a dialog message.")
                .setPositiveButton("OK") { dialog, which ->
                    Toast.makeText(this, "OK button clicked", Toast.LENGTH_SHORT).show()
                }
                .setNegativeButton("Cancel") { dialog, which ->
                    Toast.makeText(this, "Cancel button clicked", Toast.LENGTH_SHORT).show()
                }

            val dialog = builder.create()
            dialog.show()
        }


        // This is Explicit Intent

        val youtubeButton = findViewById<ImageButton>(R.id.youtubebutton)

        youtubeButton.setOnClickListener {
            val youtubeIntent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/"))

            if (intent.resolveActivity(packageManager) != null) {
                startActivity(youtubeIntent)
            } else {
                Toast.makeText(this, "No YouTube app found", Toast.LENGTH_SHORT).show()
            }
        }

    }
}