package com.example.praktikum2

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Latihan6 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_latihan6)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val etnimLatihan6 = findViewById<EditText>(R.id.etnim6)
        val etnm6 = findViewById<EditText>(R.id.etnm6)
        val et6kls = findViewById<EditText>(R.id.et6kls)
        val btLatihan6 = findViewById<Button>(R.id.bt6)
        val tvHasilLatihan6 = findViewById<TextView>(R.id.tvHasilLat6)


        btLatihan6.setOnClickListener {
            val hasil = etnimLatihan6.text.toString() + " " +
                    etnm6.text.toString() + " " +
                    et6kls .text.toString()
            tvHasilLatihan6.setText(hasil)
        }
    }
}
