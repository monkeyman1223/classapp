@file:OptIn(BetaOpenAI::class)

package com.example.classapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import com.aallam.openai.api.image.ImageCreation
import com.aallam.openai.api.image.ImageSize
import io.ktor.client.*
import io.ktor.client.engine.android.*
import com.aallam.openai.api.BetaOpenAI
import com.aallam.openai.api.image.ImageURL
import com.aallam.openai.client.OpenAI
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import com.squareup.picasso.Picasso

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