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
        //set pract2 button
        findViewById<Button>(R.id.button2).setOnClickListener{view ->
            run {
                Log.i("button", "button2 clicked")
                val context = view
                    .context
                    .startActivity(Intent(view.context, Pract2Activity::class.java))
            }
        }
        //set pract3 button
        findViewById<Button>(R.id.button3).setOnClickListener{view ->
            run {
                Log.i("button", "button3 clicked")
                val context = view
                    .context
                    .startActivity(Intent(view.context, Pract3Activity::class.java))
            }
        }
        //set pract4 button
        findViewById<Button>(R.id.button4).setOnClickListener{view ->
            run {
                Log.i("button", "button4 clicked")
                val context = view
                    .context
                    .startActivity(Intent(view.context, Pract4Activity::class.java))
            }
        }
        //set pract5 button
        findViewById<Button>(R.id.button5).setOnClickListener{view ->
            run {
                Log.i("button", "button4 clicked")
                val context = view
                    .context
                    .startActivity(Intent(view.context, Pract5Activity::class.java))
            }
        }
    }
}
