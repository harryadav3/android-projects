package com.example.caproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.transition.Fade
import androidx.core.app.ActivityOptionsCompat
import androidx.core.view.ViewCompat

class Transition1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_transition1)

        val fade  = Fade()

        window.enterTransition = fade
        window.exitTransition = fade

       var  imageView = findViewById(R.id.idIVAndroid)
        imageView.setOnClickListener {
            val intent = Intent(this@Transition1,
                madamsolution::class.java)

            val options = ActivityOptionsCompat.makeSceneTransitionAnimation(this@Transition1,
                imageView, ViewCompat.getTransitionName())

        }
    }
}