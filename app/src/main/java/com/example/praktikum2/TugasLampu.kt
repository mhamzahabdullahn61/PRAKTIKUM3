package com.example.praktikum2

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.RadioGroup
import androidx.appcompat.app.AppCompatActivity

class TugasLampu : AppCompatActivity() {

    private var lampuNyala = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tugas_lampu)

        val imgLampu = findViewById<ImageView>(R.id.imgLampu)
        val btnLampu = findViewById<Button>(R.id.btnLampu)
        val rgWarna = findViewById<RadioGroup>(R.id.rgWarna)

        imgLampu.setImageResource(R.drawable.ic_lamp_light_off)

        btnLampu.setOnClickListener {

            if (!lampuNyala) {

                when (rgWarna.checkedRadioButtonId) {

                    R.id.rbPutih -> {
                        imgLampu.setImageResource(R.drawable.ic_lamp_light_on_white)
                    }

                    R.id.rbKuning -> {
                        imgLampu.setImageResource(R.drawable.ic_lamp_light_on_yellow)
                    }

                    R.id.rbBiru -> {
                        imgLampu.setImageResource(R.drawable.ic_lamp_light_on_blue)
                    }
                }

                btnLampu.text = "TURN OFF"
                lampuNyala = true

            } else {

                imgLampu.setImageResource(R.drawable.ic_lamp_light_off)
                btnLampu.text = "TURN ON"
                lampuNyala = false
            }
        }
    }
}