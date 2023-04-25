@file:OptIn(BetaOpenAI::class)

package com.example.classapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.aallam.openai.api.BetaOpenAI
import com.bumptech.glide.Glide
import io.ktor.client.*
import io.ktor.client.engine.android.*
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import okhttp3.MultipartBody
import okhttp3.OkHttpClient
import okhttp3.Request
import org.json.JSONObject
import java.io.IOException

class SecondActivity : AppCompatActivity() {
        private lateinit var question3: TextView
        private lateinit var next_button: Button
        private lateinit var previous_button: Button
        private lateinit var whatYouSent: String
    override fun onCreate(savedInstanceState: Bundle?) {
        val startingIntent = intent
        val whatYouSent = startingIntent.getStringExtra("jobanswer")
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        next_button = findViewById(R.id.next2)
        previous_button = findViewById(R.id.previous2)
        question3 = findViewById(R.id.question2)
        val apiKey = ""

        // Replace imageView with the name of your ImageView in the layout
        val imageView = findViewById<ImageView>(R.id.AI_Image)
        val WhatYouSent = whatYouSent
        // Create an OkHttpClient to make the API request
        val client = OkHttpClient()

        // Create a multipart/form-data request with the image generation parameters
        val requestBody = MultipartBody.Builder()
            .setType(MultipartBody.FORM)
            .addFormDataPart("model", "image-alpha-001")
            .addFormDataPart("prompt", "generate an image of $WhatYouSent")
            .build()

        val request = Request.Builder()
            .url("https://api.openai.com/v1/images/generations")
            .post(requestBody)
            .addHeader("Authorization", apiKey)
            .build()

        // Make the API request asynchronously using coroutines
        GlobalScope.launch(Dispatchers.IO) {
            try {
                val response = client.newCall(request).execute()
                val responseBody = response.body?.string()
                val responseJson = JSONObject(responseBody)

                val imageUrl = responseJson.getJSONObject("data").getString("url")
                runOnUiThread {
                    Glide.with(this@SecondActivity)
                        .load(imageUrl)
                        .into(imageView)
                }
            } catch (e: IOException) {
                // Handle network errors here
                e.printStackTrace()
            }
        }

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