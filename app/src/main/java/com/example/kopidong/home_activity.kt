package com.example.kopidong

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class home_activity : AppCompatActivity() {
    private lateinit var buttonkopi : Button
    private lateinit var buttonprofil : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        buttonkopi = findViewById(R.id.kopi1)
        buttonprofil = findViewById(R.id.profil)

        buttonkopi.setOnClickListener {
            val move = Intent(this@home_activity, Kopi::class.java)
            startActivity(move)
        }
        buttonprofil.setOnClickListener {
            val move = Intent(this@home_activity, Profil::class.java)
            startActivity(move)
        }
    }
}