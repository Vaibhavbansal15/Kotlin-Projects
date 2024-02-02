package com.designs.loginsignupscreen
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class LoginPage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login_page)

        val signup_btn = findViewById<TextView>(R.id.login_footer_signup)
        val resetPasswordBtn : TextView = findViewById(R.id.resetPassword)
        val login_to_app : Button = findViewById(R.id.loginButton)

        signup_btn.setOnClickListener{
            startActivity(Intent(this, MainActivity::class.java))
            finish()
        }

        resetPasswordBtn.setOnClickListener{
            startActivity(Intent(this, ForgotPassword::class.java))
        }

        login_to_app.setOnClickListener {
            startActivity(Intent(this, HomePage::class.java))
//            finish()
        }

    }
}