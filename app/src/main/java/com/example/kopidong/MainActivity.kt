package com.example.kopidong

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private lateinit var buttonlogin : Button
    private lateinit var buttonregister : TextView
    @SuppressLint("MissingInflateid", "MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonlogin =findViewById(R.id.btnLog)
        buttonregister =findViewById(R.id.txt_reg)

        buttonlogin.setOnClickListener{
            val move = Intent(this@MainActivity, home_activity::class.java)
            startActivity(move)
        }
        buttonregister.setOnClickListener{
            val move = Intent(this@MainActivity, LoginActivity::class.java)
            startActivity(move)
        }

    }
}