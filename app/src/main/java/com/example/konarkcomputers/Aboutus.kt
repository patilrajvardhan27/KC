package com.example.konarkcomputers

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Aboutus : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_aboutus)
        val buynp:Button = findViewById(R.id.newprod)
        buynp.setOnClickListener(){
            val intent = Intent(this, NewProduct :: class.java)
            startActivity(intent)
        }
        val btnser:Button = findViewById(R.id.applyser)
        btnser.setOnClickListener(){
            val intent = Intent(this, service :: class.java)
            startActivity(intent)
        }
        val btnconus:Button = findViewById(R.id.contus)
        btnconus.setOnClickListener(){
            val intent = Intent(this, contactus :: class.java)
            startActivity(intent)
        }

    }
}