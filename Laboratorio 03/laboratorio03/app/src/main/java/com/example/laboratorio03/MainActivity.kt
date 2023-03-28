package com.example.laboratorio03

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    lateinit var moneyCountTextView: TextView
    lateinit var fiveCentsImageView: Button
    lateinit var dimeImageView: Button
    lateinit var quarterImageView: Button
    lateinit var dollarImageView: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        bind()
    }

    override fun onStart() {
        super.onStart()
        onClickCoin(fiveCentsImageView)
    }


    private fun bind(){
        fiveCentsImageView = findViewById(R.id.five_cents_image_view)
        dimeImageView = findViewById(R.id.dime_image_view)
        quarterImageView = findViewById(R.id.quarter_image_view)
        dollarImageView = findViewById(R.id.dollar_image_view)
        moneyCountTextView = findViewById(R.id.money_count_text_view)
    }

    private fun onClickCoin(coin:Button){
        val moneyCounter = 0
        coin.setOnClickListener {  }
        return
    }
}
