package com.example.intent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_activitity_kedua.*


class ActivitityKedua : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        //super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_activitity_kedua)

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_activitity_kedua)

        val bundle: Bundle? = intent.extras
        val id = bundle?.get("id_value")
        val language =  bundle?.get("language_values")
        Toast.makeText(applicationContext,id.toString()+""+
        ""+language,Toast.LENGTH_SHORT).show()
        btn_back.setOnClickListener(){
            intent= Intent(this,MainActivity::class.java)
            startActivity(intent)
                }


    }
}




