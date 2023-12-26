package com.example.kopidong

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class LoginActivity : AppCompatActivity() {
    private lateinit var buttonlogin : Button
    private lateinit var buttonregister : TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        buttonlogin = findViewById(R.id.btnLogin)
        buttonregister = findViewById(R.id.txt_register)

        buttonlogin.setOnClickListener{
            val move = Intent(this@LoginActivity, home_activity::class.java)
            startActivity(move)

        }
        buttonregister.setOnClickListener{
            val move = Intent(this@LoginActivity, RegisterActivity::class.java)
            startActivity(move)

        }
    }
}