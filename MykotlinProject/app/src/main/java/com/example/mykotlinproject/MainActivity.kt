package com.example.mykotlinproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.os.Message
import android.widget.EditText
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val NIM = findViewById<EditText>(R.id.editText)
        val Nama = findViewById<EditText>(R.id.editText)
        val Nilai = findViewById<EditText>(R.id.editText)

        button.setOnClickListener {
            if((editText.text.isEmpty())||editText2.text.isEmpty()||editText3.text.isEmpty()){
                toast("kolom tidak boleh kosong", Toast.LENGTH_LONG)
        } else {
          val nim = NIM.text.toString()
            val nama = Nama.text.toString()
            val nilai : Int = Integer.parseInt(Nilai.text.toString())
            val intent = Intent(this@MainActivity, Main2Activity::class.java)
            intent.putExtra("nim",nim)
            intent.putExtra("nama",nama)
            intent.putExtra("nilai",nilai)

            startActivity(intent)
        }
        }
    }
    fun toast(message: String,lenght: Int=Toast.LENGTH_LONG){
        Toast.makeText(this, message, lenght).show()
    }
}


