package com.example.practiceandroidapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //set pract1 button
        findViewById<View>(R.id.button1).setOnClickListener(View.OnClickListener {
            fun onClick(view:View){
                val context=view
                    .context
                    .startActivity(Intent(view.context,Pract1Activity::class.java))
            }
        })
    }
}
