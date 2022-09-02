package com.example.jakasnazwa_01092022

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import androidx.core.view.isVisible

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var btn_pu = findViewById<Button>(R.id.btn_pu)
        var obraz = findViewById<ImageView>(R.id.obraz)
        var liczba = 1
        btn_pu.setOnClickListener {

            if (obraz.isVisible) {
                obraz.visibility = View.INVISIBLE
            }
            else{
                obraz.visibility = View.VISIBLE
            }


        }
    }
}