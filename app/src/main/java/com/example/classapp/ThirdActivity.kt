package com.example.classapp

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.aallam.openai.api.BetaOpenAI
import com.aallam.openai.api.image.ImageURL
import com.aallam.openai.client.OpenAI
import kotlinx.coroutines.delay


class ThirdActivity : AppCompatActivity() {
    private lateinit var question3: TextView
    private lateinit var next_button: Button
    private lateinit var previous_button: Button
    val apiKey = System.getenv("OPENAI_API_KEY")
    val token = requireNotNull(apiKey)
    val openAI = OpenAI(token = token)

    override fun onCreate(savedInstanceState: Bundle?) {
        val startingIntent = intent
        val whatYouSent = startingIntent.getStringExtra("jobanswer")
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third)
        previous_button = findViewById(R.id.previous3)
        next_button = findViewById(R.id.next3)
        delay(1000) {
            openAI.chatCompletion()
        }
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