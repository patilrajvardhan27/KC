package com.example.konarkcomputers

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Spinner
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.konarkcomputers.databinding.ActivityNewProductBinding

class NewProduct : AppCompatActivity() {

    lateinit var binding: ActivityNewProductBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        val drop = arrayOf("Laptop" , "CPU" , "CCTV" , "Monitor" , "Keyboard" , "Mouse" , "Keyboard + Mouse" , "Pendrive")
        super.onCreate(savedInstanceState)
        binding = ActivityNewProductBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnsendnp.setOnClickListener {

            val spinner = findViewById<Spinner>(R.id.drop)
            val prodyou = findViewById<TextView>(R.id.prodyouwant)

            val option = arrayOf("Laptop" , "CPU" , "CCTV" , "Monitor" , "Keyboard" , "Mouse" , "Keyboard + Mouse" , "Pendrive")

            val arrayAdapter = ArrayAdapter(this,android.R.layout.simple_spinner_item,option)

            spinner.adapter = arrayAdapter

            spinner.onItemSelectedListener = object:AdapterView.OnItemSelectedListener{
                override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                    prodyou.text = "you selected ${option.get(p2).toString()}"
                }

                override fun onNothingSelected(p0: AdapterView<*>?) {
                    prodyou.text = "please select the item"
                }

            }






            val email = arrayOf(binding.emailcontainer.text.toString())
            val inputext1 = binding.prof.text.toString()
            val inputext22 = binding.prof.text.toString()
            val inputext33 = binding.Nmodel.text.toString()
            val inputext44 = binding.msg.text.toString()
            val inputext55 = binding.prodyouwant.text.toString()
            val intent = Intent(Intent.ACTION_SENDTO).apply {
                data = Uri.parse("mailto:")
                putExtra(Intent.EXTRA_EMAIL, email)
                putExtra(Intent.EXTRA_SUBJECT, inputext1 )
                putExtra(Intent.EXTRA_TEXT, inputext22 + "\n" + inputext33 + "\n" + inputext44 + "\n" + inputext55)
            }
            if (intent.resolveActivity(packageManager) != null) {
                startActivity(intent)
            }
        }
    }
}