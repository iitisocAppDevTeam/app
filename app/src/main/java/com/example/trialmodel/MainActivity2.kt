package com.example.trialmodel

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        val Continue: Button=findViewById(R.id.Continue)
        Continue.setOnClickListener {
            val intent= Intent(this@MainActivity2, MainActivity3::class.java )
            startActivity(intent)
        }

    }
}