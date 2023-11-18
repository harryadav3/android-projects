package com.example.endtermexam

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.Menu
import android.view.MenuItem
import android.widget.ArrayAdapter
import android.widget.EditText
import android.widget.ListView

class sorting : AppCompatActivity() {

    private lateinit var listView: ListView
    private lateinit var adapter: ArrayAdapter<String>
    private var itemList = arrayOf(
        "Orange", "Banana", "Apple", "Grapes", "Cherry", "Kiwi", "Kumquat", "Lemon", "Lime", "Mango", "Melon", "Nectarine"
    )
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sorting)

        listView = findViewById(R.id.listitems)
        adapter = ArrayAdapter(this, android.R .layout.simple_list_item_1, itemList)
        listView.adapter = adapter


        var searchBox = findViewById<EditText>(R.id.searchbox)
        searchBox.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
                // Do nothing
            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                // Filter the list based on the search input
                adapter.filter.filter(s)
            }

            override fun afterTextChanged(s: Editable?) {
                // Do nothing
            }
        })
    }


    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.sorting_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.menuSortAscending -> {
                itemList.sort()
                adapter.notifyDataSetChanged()
                return true
            }
            R.id.menuSortDescending -> {
                itemList.sortDescending()
                adapter.notifyDataSetChanged()
                return true
            }
            else -> return super.onOptionsItemSelected(item)
        }
    }
}