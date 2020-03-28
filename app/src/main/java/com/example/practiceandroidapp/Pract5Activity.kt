package com.example.practiceandroidapp

import android.app.NotificationChannel
import android.app.NotificationManager
import android.app.PendingIntent
import android.content.Context
import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.annotation.RequiresApi
import androidx.core.app.NotificationCompat

class Pract5Activity : AppCompatActivity() {

    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val channelId="mypracticeAppNotificationChannel"
        val channelName="mypracticeAppNotificationChannel"
        val channelDesc="mypracticeAppNotificationChannel"
        setContentView(R.layout.activity_pract5)

        val penIntent = Intent(this,Pract5Activity::class.java)
        val pendent = PendingIntent.getActivity(this,0,penIntent,0)

        val builder = NotificationCompat.Builder(this,channelId)
            .setWhen(System.currentTimeMillis())
            .setContentTitle("Practice5 Notification!")
            .setContentText("通知通知通知通知通知通知通知通知通知通知通知")
            .setSmallIcon(R.drawable.ic_launcher_foreground)
            .setTicker("+++++通知+++++")
            .setContentIntent(pendent)
            .build()

        val mng = getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager
        if(mng.getNotificationChannel(channelId)==null){
            Log.i("pract5","create channel")
            val mc=NotificationChannel(channelId,channelName,NotificationManager.IMPORTANCE_HIGH)
            mc.apply {
                description=channelDesc
            }
            mng.createNotificationChannel(mc)
        }else{
            Log.i("pract5","go notification")
            mng.notify(1,builder)
        }

    }
}
