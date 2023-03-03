package com.example.classapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class SecondActivity : AppCompatActivity() {
        private lateinit var question2: TextView
        private lateinit var next_button: Button
        private lateinit var previous_button: Button
        public lateinit var APIKey: EditText

        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_second)


            next_button = findViewById(R.id.next2)
            previous_button = findViewById(R.id.previous1)
            question2 = findViewById(R.id.question2_id)
            APIKey = findViewById(R.id.APIKey)

            next_button.setOnClickListener {
                val intent = Intent(this, ThirdActivity::class.java)
               startActivity(intent)
            }
            previous_button.setOnClickListener {
                val intent = Intent(this, MainActivity::class.java)
                startActivity(intent)
            }
        }
    }