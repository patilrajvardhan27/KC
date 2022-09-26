package com.example.konarkcomputers

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.konarkcomputers.databinding.ActivityNewProductBinding

class NewProduct : AppCompatActivity() {

    lateinit var binding: ActivityNewProductBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityNewProductBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnsendnp.setOnClickListener {
            val email = arrayOf(binding.emailcontainer.text.toString())
            val inputext1 = binding.prod.text.toString()
            val inputext22 = binding.prof.text.toString()
            val inputext33 = binding.Nmodel.text.toString()
            val inputext44 = binding.msg.text.toString()
            val intent = Intent(Intent.ACTION_SENDTO).apply {
                data = Uri.parse("mailto:")
                putExtra(Intent.EXTRA_EMAIL, email)
                putExtra(Intent.EXTRA_SUBJECT, inputext1)
                putExtra(Intent.EXTRA_TEXT, inputext22 + "\n" + inputext33 + "\n" + inputext44)
            }
            if (intent.resolveActivity(packageManager) != null) {
                startActivity(intent)
            }
        }
    }
}