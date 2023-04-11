package com.example.labo04

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.google.android.material.textfield.TextInputLayout

class MainActivity : AppCompatActivity() {
    lateinit var textview : TextView
    lateinit var nameInputText : TextInputLayout
    lateinit var emailInputLayout: TextInputLayout
    lateinit var numberInputLayout: TextInputLayout
    lateinit var saveAction : Button

    //variables
    private var name = ""
    private var email = ""
    private var number = ""

    val intent = Intent(this, activity_secondary::class.java)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        bind()
        addListener()
    }

    private fun bind(){
        textview = findViewById(R.id.textView)
        nameInputText = findViewById(R.id.nameInputText)
        emailInputLayout = findViewById(R.id.emailInputText)
        numberInputLayout = findViewById(R.id.numberInputText)
        saveAction = findViewById(R.id.saveAction)
    }


    private fun addListener() {
        saveAction.setOnClickListener {
            name = nameInputText.toString()
            email = emailInputLayout.toString()
            number = numberInputLayout.toString()
        }

    }
}