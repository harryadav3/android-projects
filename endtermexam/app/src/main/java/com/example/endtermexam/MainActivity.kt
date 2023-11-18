package com.example.endtermexam

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.ContextMenu
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.PopupMenu
import android.widget.TextView
import android.widget.Toast
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Ensure the textView is initialized before accessing it
//        val cmbtn: TextView = findViewById(R.id.contextmenu)
//        if (cmbtn != null) {
//            cmbtn.registerForContextMenu(this)
//        }

        val btn = findViewById<Button>(R.id.submitbutton)
        btn.setOnClickListener {
            val name = findViewById<EditText>(R.id.username)
            val username = name.text.toString()

            startActivity(Intent(this, home_activity::class.java).also {
                it.putExtra("EXTRA_MESSAGE", username)
            })
        }

        val sortingbtn = findViewById<Button>(R.id.sortingmenu)
        sortingbtn.setOnClickListener {
            startActivity(Intent(this, sorting::class.java))
        }


        val gallerybtn = findViewById<Button>(R.id.gallerybutton)
        gallerybtn.setOnClickListener {
            startActivity(Intent(this, gallery::class.java))
        }

        findViewById<Button>(R.id.popupmenu).setOnClickListener {
            val popup = PopupMenu(this, it)
            val inflater: MenuInflater = popup.menuInflater
            inflater.inflate(R.menu.pop_up_menu, popup.menu)
            popup.show()
        }
    }

    // Add the override keyword to indicate that it's overriding the parent method
    @Override
    override fun onCreateContextMenu(
        menu: ContextMenu?,
        v: View?,
        menuInfo: ContextMenu.ContextMenuInfo?
    ) {
        super.onCreateContextMenu(menu, v, menuInfo)
        val inflater: MenuInflater = menuInflater
        inflater.inflate(R.menu.game_menu, menu)
    }

    // Add the override keyword to indicate that it's overriding the parent method
    @Override
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.custom_menu, menu)
        return true
    }

    // Add the override keyword to indicate that it's overriding the parent method
    @Override
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.search -> {
                Toast.makeText(this, "You clicked Search", Toast.LENGTH_LONG).show()
                return true
            }
            R.id.favorite -> {
                Toast.makeText(this, "You clicked Favorite", Toast.LENGTH_LONG).show()
                return true
            }
            R.id.listview -> {
                val rootView = findViewById<View>(android.R.id.content)
                Snackbar.make(rootView, "You clicked nested list", Snackbar.LENGTH_INDEFINITE)
                    .setAction("Okay") {
//                        Snackbar.make(rootView, "You clicked again", Snackbar.LENGTH_SHORT).show()
                    }.show()
                return true
            }
            R.id.twitter -> {
                Toast.makeText(this, "You clicked Twitter", Toast.LENGTH_LONG).show()
                return true
            }
            R.id.facebook -> {
                Toast.makeText(this, "You clicked Facebook", Toast.LENGTH_LONG).show()
                return true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }
}
