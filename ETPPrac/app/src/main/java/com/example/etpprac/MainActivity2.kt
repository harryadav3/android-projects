package com.example.etpprac

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.widget.ArrayAdapter
import android.widget.Toast
import androidx.appcompat.widget.SearchView
import com.example.etpprac.databinding.ActivityMain2Binding


class MainActivity2 : AppCompatActivity() {
    private lateinit var binding: ActivityMain2Binding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        var items = arrayOf("apple", "moto", "samsung", "nokia", "lava", "windows", "linux", "ubuntu", "debian", "fedora", "redhat", "parrot", "kali")

        var searchbox = binding.searchbox
        var itemslist = binding.listitems

        var adapter = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, items)

        itemslist.adapter = adapter

        searchbox.setOnQueryTextListener(object : SearchView.OnQueryTextListener{
            override fun onQueryTextSubmit(query: String?): Boolean {
//                adapter.filter.filter(query)
                return false
            }

            override fun onQueryTextChange(newText: String?): Boolean {
                adapter.filter.filter(newText)
                return false
            }
        })

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.mainmenu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when(item.itemId){
            R.id.item1 -> {
                Toast.makeText(this, "this is the edit option", Toast.LENGTH_SHORT).show()
                true
            }

            R.id.opt1 -> {
                Toast.makeText(this, "this is the  option 1", Toast.LENGTH_SHORT).show()
                true
            }

            R.id.opt2 -> {
                Toast.makeText(this, "this is the submenu option", Toast.LENGTH_SHORT).show()
                true
            }

            R.id.opt3 -> {
                Toast.makeText(this, "this is the  option3", Toast.LENGTH_SHORT).show()
                true
            }

            R.id.subopt1 -> {
                Toast.makeText(this, "this is the subopt1", Toast.LENGTH_SHORT).show()
                true
            }

            R.id.subopt2 -> {
                Toast.makeText(this, "this is the subopt2", Toast.LENGTH_SHORT).show()
                true
            }

            else -> {
                Toast.makeText(this, "this is the idk", Toast.LENGTH_SHORT).show()
                super.onOptionsItemSelected(item)
            }
        }
    }
}