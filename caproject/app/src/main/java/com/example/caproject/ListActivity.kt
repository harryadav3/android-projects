package com.example.caproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class ListActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list)

        // Get the type of list to display (car or bike)
        val type = intent.getStringExtra("type")

        val dataList = if (type == "car") {
            listOf(
                "Tesla Model S",
                "Nissan Leaf",
                "Chevrolet Bolt EV",
                "BMW i3",
                "Hyundai Kona Electric"
            )
        } else {
            listOf(
                "Zero SR/F",
                "Harley-Davidson LiveWire",
                "Energica EVA",
                "Cake Kalk&",
                "Sur-Ron Light Bee"
            )
        }
        // Set up RecyclerView
        val recyclerView: RecyclerView = findViewById(R.id.recycler_view)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = ElectricVehicleAdapter(dataList)
    }
}

class ElectricVehicleAdapter(private val dataList: List<String>) : RecyclerView.Adapter<ElectricVehicleAdapter.ViewHolder>() {
    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val nameTextView: TextView = itemView.findViewById(R.id.name_text_view)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_electric_vehicle, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = dataList[position]
        holder.nameTextView.text = item
    }

    override fun getItemCount(): Int {
        return dataList.size
    }
}
