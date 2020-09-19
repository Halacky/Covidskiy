package com.example.covidskiy

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class StartActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.start_activity)
    }

    fun startToUseApp(view: View){
        val mainIntent = Intent(this,MainActivity::class.java)

        startActivity(mainIntent)
    }
}