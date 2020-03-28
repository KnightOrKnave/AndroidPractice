package com.example.practiceandroidapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //set pract1 button
        findViewById<Button>(R.id.button1).setOnClickListener{view ->
            run {
                Log.i("button", "button1 clicked")
                val context = view
                    .context
                    .startActivity(Intent(view.context, Pract1Activity::class.java))
            }
        }
    }
}
