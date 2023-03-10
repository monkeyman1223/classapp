@file:OptIn(BetaOpenAI::class)

package com.example.classapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.aallam.openai.api.BetaOpenAI
import io.ktor.client.*
import io.ktor.client.engine.android.*

class SecondActivity : AppCompatActivity() {
        private lateinit var question3: TextView
        private lateinit var next_button: Button
        private lateinit var previous_button: Button
        private lateinit var AI_Image: ImageView
        private lateinit var whatYouSent: String

    override fun onCreate(savedInstanceState: Bundle?) {
        val startingIntent = intent
        val whatYouSent = startingIntent.getStringExtra("jobanswer")
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        next_button = findViewById(R.id.next2)
        previous_button = findViewById(R.id.previous2)
        question3 = findViewById(R.id.question2)


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