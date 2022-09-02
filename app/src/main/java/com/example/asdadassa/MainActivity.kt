package com.example.asdadassa

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.core.view.isVisible

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val obrazek = findViewById<ImageView>(R.id.img)
        val buton = findViewById<Button>(R.id.button)
        val napis = findViewById<TextView>(R.id.tekst)


        var ukryte = false

        buton.setOnClickListener {
            if(ukryte) {
                obrazek.isVisible = true
                napis.isVisible = true
                buton.text = "Ukryj"
                ukryte = false
            } else{
                obrazek.isVisible = false
                napis.isVisible = false
                buton.text = "Pokaż"
                ukryte = true
            }
        }
    }
}