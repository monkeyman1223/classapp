package com.example.classapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity



class MainActivity : AppCompatActivity() {

    private lateinit var question1: TextView
    private lateinit var submitbutton: Button
    private lateinit var editText: EditText
    private lateinit var jobname: String
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //title = "Twitter post by job"
        editText = findViewById(R.id.jobfield)
        question1 = findViewById(R.id.question)
        submitbutton = findViewById(R.id.submitbutton)
        submitbutton.setOnClickListener {
            val intent = Intent(this,SecondActivity::class.java)
            jobname = editText.text.toString()
            intent.putExtra("jobanswer", jobname)
            startActivity(intent)
        }

    }
    }

