package com.example.classapp

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class ThirdActivity : AppCompatActivity() {
    private lateinit var question3: TextView
    private lateinit var next_button: Button
    private lateinit var previous_button: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third)
        previous_button = findViewById(R.id.previous3)
        next_button = findViewById(R.id.next3)

        next_button.setOnClickListener {
            val intent = Intent(this, ForthActivity::class.java)
            startActivity(intent)
        }
        previous_button.setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java)
            startActivity(intent)
        }
    }
}