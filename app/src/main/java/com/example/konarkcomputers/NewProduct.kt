package com.example.konarkcomputers

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.konarkcomputers.databinding.ActivityNewProductBinding

class NewProduct : AppCompatActivity() {

    lateinit var binding: ActivityNewProductBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityNewProductBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnsendnp.setOnClickListener {
            val email = binding.emailcontainer.toString()
            val inputext1 = binding.prod.toString()
            val inputext22 = binding.prof.toString()
            val inputext33 = binding.Nmodel.toString()
            val inputext44 = binding.msg.toString()

            val shareintent = Intent()
            shareintent.action = Intent.ACTION_SEND


            shareintent.data = Uri.parse("mailto:")
            shareintent.putExtra(Intent.EXTRA_EMAIL, email)
            shareintent.putExtra(Intent.EXTRA_SUBJECT, inputext1)
            shareintent.putExtra(Intent.EXTRA_TEXT, inputext22)
            shareintent.putExtra(Intent.EXTRA_TEXT, inputext33)
            shareintent.putExtra(Intent.EXTRA_TEXT, inputext44)

        startActivity(Intent.createChooser(shareintent,"Email to"))
        }
    }
}
