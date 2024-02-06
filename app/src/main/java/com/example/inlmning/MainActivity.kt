package com.example.inlmning

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val mintext = findViewById<TextView>(R.id.textView)
        mintext.text= "Welcome"

        val minknapp = findViewById<Button>(R.id.buttonView)
        minknapp.setOnClickListener {
            mintext.text = "Goodby"

        }

    }
}