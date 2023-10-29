package com.example.unitconverter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val inputValue : EditText = findViewById(R.id.inputText)
        val myBtn : Button = findViewById(R.id.convertBtn)
        val result : TextView = findViewById(R.id.resultText)

        myBtn.setOnClickListener{
            val value : Double = inputValue.text.toString().toDouble()
            val inPounds = convertToPounds(value)
            result.setText(""+inPounds)
        }
    }

     private fun convertToPounds(kilos : Double) : Double{
        return kilos * 2.2
    }
}