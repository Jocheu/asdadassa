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

        var obrazek = findViewById<ImageView>(R.id.imageView);
        var buton = findViewById<Button>(R.id.button);
        var napis = findViewById<TextView>(R.id.tekst);

        var ukryte = false;

        buton.setOnClickListener {
            if(ukryte) {
                obrazek.isVisible = true;
                napis.isVisible = true
                ukryte = false
            } else{
                obrazek.isVisible = false;
                napis.isVisible = false;
                ukryte = true;
            }
        }
    }
}