package com.example.practiceandroidapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.fragment.app.FragmentManager

class Pract3Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pract3)

        val arr= arrayListOf("a","b","c","d")
        val bind =Bundle()
        bind.putString("param1","hoge")
        bind.putString("param2",Math.random().toString())
        bind.putStringArrayList("param3",arr)

        supportFragmentManager.findFragmentById(R.id.Flagment1 )
        findViewById<TextView>(R.id.flagment_text_1).setText(Math.random().toString())
    }
}
