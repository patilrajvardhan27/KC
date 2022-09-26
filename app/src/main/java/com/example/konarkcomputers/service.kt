package com.example.konarkcomputers

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class service : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_service)
        val btnNxt: Button = findViewById(R.id.btnsoft)
        btnNxt.setOnClickListener(){
            val intent = Intent(this,softwarecomp::class.java)
            startActivity(intent)
        }
        val btnNxt2:Button = findViewById(R.id.btnhard)
        btnNxt2.setOnClickListener(){
            val intent = Intent(this,hardwarecomp::class.java)
            startActivity(intent)
        }

    }
}