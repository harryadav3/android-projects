package com.example.etp_alarmmanager

import android.app.AlarmManager
import android.app.PendingIntent
import android.app.PendingIntent.FLAG_IMMUTABLE
import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class AlarmManagerEx : AppCompatActivity() {

    lateinit var btn_start : Button
    lateinit var btn_repeat : Button
    lateinit var btn_cancel : Button
    lateinit var et_time : EditText
    lateinit var alarm_manager : AlarmManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_alarm_manager)

        val intent = Intent(this, AlarmManagerBroadcast::class.java)
        val pending_intent = PendingIntent.getBroadcast(this, 0, intent,  FLAG_IMMUTABLE)

        btn_start.setOnClickListener {
            val i = et_time.text.toString().toInt()
            alarm_manager = getSystemService(Context.ALARM_SERVICE) as AlarmManager
            alarm_manager.set(AlarmManager.RTC_WAKEUP, System.currentTimeMillis()+(i*1000), pending_intent)
            Toast.makeText(this, "Alarm set in $i sec", Toast.LENGTH_SHORT).show()
        }

        btn_repeat.setOnClickListener {
            alarm_manager = getSystemService(ALARM_SERVICE) as AlarmManager
            alarm_manager.setRepeating(AlarmManager.RTC_WAKEUP, System.currentTimeMillis(), 5000, pending_intent)
        }

        btn_cancel.setOnClickListener {
            alarm_manager = getSystemService(ALARM_SERVICE) as AlarmManager
            alarm_manager.cancel(pending_intent)
        }

    }
}