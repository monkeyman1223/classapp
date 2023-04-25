@file:OptIn(BetaOpenAI::class)
package com.example.classapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import okhttp3.Call
import okhttp3.Callback
import okhttp3.MultipartBody
import okhttp3.OkHttpClient
import okhttp3.Request
import okhttp3.Response
import org.json.JSONObject
import java.io.IOException
import com.aallam.openai.api.BetaOpenAI
import com.aallam.openai.api.chat.*
import com.aallam.openai.api.model.ModelId
import com.aallam.openai.client.OpenAI
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class ThirdActivity : AppCompatActivity() {
    private lateinit var question3: TextView
    private lateinit var next_button: Button
    private lateinit var previous_button: Button
    //val apiKey = System.getenv("OPENAI_API_KEY")
    //val token = requireNotNull(apiKey)
    //val openAI = OpenAI(token = token)

    override fun onCreate(savedInstanceState: Bundle?) {
        val startingIntent = intent
        val whatYouSent = startingIntent.getStringExtra("jobanswer")
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
