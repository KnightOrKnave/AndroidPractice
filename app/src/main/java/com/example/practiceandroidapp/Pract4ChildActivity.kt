package com.example.practiceandroidapp

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

class Pract4ChildActivity: AppCompatActivity() {

    val REQUEST_CODE_HOGE:Int = 1
    override fun onCreate(savedInstanceState:Bundle?){
        super.onCreate(savedInstanceState)
        Log.i("child Activity","Start")
        setResult(RESULT_OK, Intent())
        Log.i("child Activity","End")
        finish()
    }
}