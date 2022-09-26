package com.example.landscapevsportrait

import android.content.res.Configuration
import android.os.Bundle
import android.widget.TextView

import androidx.appcompat.app.AppCompatActivity

   lateinit var  tvChangingText:TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tvChangingText=findViewById(R.id.tvChangingText)
        val orientation= this.resources.configuration.orientation

        if (orientation === Configuration.ORIENTATION_LANDSCAPE) {
            tvChangingText.setText("Tumabao")
        } else if (orientation === Configuration.ORIENTATION_PORTRAIT) {
            tvChangingText.setText("De Pie")
        }
    }


}