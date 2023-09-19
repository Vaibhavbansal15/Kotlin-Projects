package com.example.counterapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private var counter = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn : Button = findViewById(R.id.btn)
        val resetBtn : Button = findViewById(R.id.btn2)
        val resultTxt : TextView = findViewById(R.id.result)

        resetBtn.setOnClickListener(){
            resultTxt.setText(""+reset())
        }

        btn.setOnClickListener(){
            resultTxt.setText(""+increment())
        }
    }

    private fun increment(): Int{
        counter++
        return counter
    }

    private fun reset(): Int{
        counter = 0
        return counter
    }
}