package com.example.labo04

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class SecondaryActivity : AppCompatActivity() {

    lateinit var confirmTextView : TextView
    lateinit var nameTextView : TextView
    lateinit var emailTextView: TextView
    lateinit var numberTextView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_secondary)
        bind()
    }

    private fun bind(){
        confirmTextView = findViewById(R.id.confirm_text_view)
        nameTextView = findViewById(R.id.name_text_view)
        emailTextView = findViewById(R.id.email_text_view)
        numberTextView = findViewById(R.id.number_text_view)
    }
}