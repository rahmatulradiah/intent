package com.example.mykotlinproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast

class Main2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val intent = this.intent
        val nim = intent.getStringExtra("nim")
        val nama = intent.getStringExtra("nama")
        val nilai = intent.getIntExtra("nilai",0)
        val ket: String

        if (nilai >= 80) {
            ket = "A"
        } else if (nilai >= 60) {
            ket = "B"
        } else if (nilai >= 40) {
            ket = "C"
        } else if (nilai >= 20) {
            ket = "D"
        } else if (nilai <= 0) {
            ket = "E"
        } else {
            ket = "uhuyy"
        }
        val hasil = findViewById<TextView>(R.id.textView1)
        val Keterangan = findViewById<TextView>(R.id.textView1)
        hasil.text = "Nim:" + nim + "\nNama:" + nama + "\nNilai:" + nilai
        Keterangan.text = "Keterangan:" + ket
    }
}
