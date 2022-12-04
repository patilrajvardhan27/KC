package com.example.konarkcomputers

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Spinner
import android.widget.TextView
import com.example.konarkcomputers.databinding.ActivitySoftwarecompBinding

class softwarecomp : AppCompatActivity() {

    lateinit var binding: ActivitySoftwarecompBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySoftwarecompBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnsofsend.setOnClickListener(){

            val spinner = findViewById<Spinner>(R.id.softdrop)
            val prodyou = findViewById<TextView>(R.id.softprod)

            val option = arrayOf("NPAV Antivirus" , "Quickheal Antivirus" , "Microsoft Office" , "Tally" , "Adobe Software" )

            val arrayAdapter = ArrayAdapter(this,android.R.layout.simple_spinner_item,option)

            spinner.adapter = arrayAdapter

            spinner.onItemSelectedListener = object: AdapterView.OnItemSelectedListener{
                override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                    prodyou.text = "you selected ${option.get(p2).toString()}"
                }

                override fun onNothingSelected(p0: AdapterView<*>?) {
                    prodyou.text = "please select the item"
                }

            }












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