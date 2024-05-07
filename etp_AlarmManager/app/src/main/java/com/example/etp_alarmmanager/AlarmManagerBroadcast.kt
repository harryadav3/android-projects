package com.example.etp_alarmmanager

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.media.MediaPlayer
import android.util.Log
import android.widget.Toast

class AlarmManagerBroadcast : BroadcastReceiver() {
    override fun onReceive(context: Context, intent: Intent) {
        val mp = MediaPlayer.create(context, R.raw.alarm)
        mp.start()
        Log.d("Hello" , "Alarm Ringing !!!")
    }
}