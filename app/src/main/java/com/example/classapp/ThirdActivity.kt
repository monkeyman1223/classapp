package com.example.classapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class ThirdActivity : AppCompatActivity() {
    private lateinit var question3: TextView
    private lateinit var next_button: Button
    private lateinit var previous_button: Button
    public lateinit var post_image: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third)
        next_button = findViewById(R.id.next4)
        previous_button = findViewById(R.id.previous2)
        question3 = findViewById(R.id.question3_id)

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