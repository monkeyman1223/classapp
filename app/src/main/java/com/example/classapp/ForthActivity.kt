package com.example.classapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.core.content.ContextCompat.startActivity

class ForthActivity : AppCompatActivity() {
    private lateinit var question4: TextView
    private lateinit var submitbutton: Button
    private lateinit var previous_button: Button
    private lateinit var edittext: EditText
    private lateinit var APIKey: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_forth)
        previous_button = findViewById(R.id.previous4)
        question4 = findViewById(R.id.question4)
        edittext = findViewById(R.id.APIKey)
        submitbutton = findViewById(R.id.submitbutton)

        submitbutton.setOnClickListener {
            val intent = Intent(this,FifthActivity::class.java)
            APIKey = edittext.text.toString()
            intent.putExtra("APIKey", APIKey)
            startActivity(intent)
        }

        previous_button.setOnClickListener {
            val intent = Intent(this, ThirdActivity::class.java)
            startActivity(intent)
        }
    }
}