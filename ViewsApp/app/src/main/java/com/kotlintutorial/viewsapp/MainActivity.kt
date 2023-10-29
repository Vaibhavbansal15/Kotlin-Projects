package com.kotlintutorial.viewsapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val editText : EditText = findViewById(R.id.EditText)
        val myBtn : Button = findViewById(R.id.btn)
        val imgView : ImageView = findViewById(R.id.imageView)
    // OR
    // val editText = findViewById<editText>(R.id.EditText)

        var input = editText.text
        myBtn.setOnClickListener{
            // This code will get executed when button is clicked
            Toast.makeText(this@MainActivity,
                "Hello $input",
                Toast.LENGTH_SHORT )
                .show()
        }

        imgView.setImageResource(R.drawable.ic_launcher_background)
    }
}