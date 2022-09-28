package com.example.jobsheet13

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
class MainActivity2 : AppCompatActivity() {
    private lateinit var namaView: TextView
    private lateinit var NISView: TextView
    private lateinit var kelasView: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        namaView = findViewById(R.id.namaView)
        NISView = findViewById(R.id.NISView)
        kelasView = findViewById(R.id.kelasView)
        val extras = intent.extras
        namaView.text = extras?.getString("Nama")
        NISView.text = extras?.getString("NIS")
        kelasView.text = extras?.getString("Kelas")
    }
}