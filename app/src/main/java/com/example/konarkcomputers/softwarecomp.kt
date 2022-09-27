package com.example.konarkcomputers

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.konarkcomputers.databinding.ActivitySoftwarecompBinding

class softwarecomp : AppCompatActivity() {

    lateinit var binding: ActivitySoftwarecompBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySoftwarecompBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnsofsend.setOnClickListener(){
            val email = arrayOf(binding.emailcontainer.text.toString())
            val inptext1 = binding.softprod.text.toString()
            val inptext2 = binding.msg.text.toString()
            val intent = Intent(Intent.ACTION_SENDTO).apply {
                data = Uri.parse("mailto:")
                putExtra(Intent.EXTRA_EMAIL,email)
                putExtra(Intent.EXTRA_SUBJECT,inptext1)
                putExtra(Intent.EXTRA_TEXT,inptext2)
            }
            if (intent.resolveActivity(packageManager)!=null){
                startActivity(intent)
            }
        }
    }
}