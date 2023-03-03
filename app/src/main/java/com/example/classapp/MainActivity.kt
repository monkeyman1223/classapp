package com.example.classapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.aallam.openai.api.image.ImageEdit
import com.aallam.openai.api.image.ImageSize
import com.aallam.openai.client.OpenAI
import okio.source


class MainActivity : AppCompatActivity() {

    private lateinit var question1: TextView
    private lateinit var answer1: EditText
    private lateinit var next_Activity_button: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        next_Activity_button = findViewById(R.id.button)
        question1 = findViewById(R.id.question)
        //var editTextHello = answer1.text.toString()
        next_Activity_button.setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java)
            startActivity(intent)
        }
    }
}

