package com.designs.loginsignupscreen

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val login_btn = findViewById<TextView>(R.id.signup_footer_login)

        login_btn.setOnClickListener{
            startActivity(Intent(this, LoginPage::class.java))
        }
    }
}