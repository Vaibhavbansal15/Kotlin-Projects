package com.example.greetingsapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // step2 - Declaring views
        val edt : EditText = findViewById(R.id.editText)
        val btn = findViewById<Button>(R.id.btn)
        // these Above are the 2 different ways to define variables in kotlin


        //Step-3: Adding Functionalities
        // Handling onClick events
        btn.setOnClickListener(){
            var entered_text = edt.text

            Toast.makeText(this,
                "Hello "+entered_text,
                Toast.LENGTH_LONG).show()
        }
    }
}