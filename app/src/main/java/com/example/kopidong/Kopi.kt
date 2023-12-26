package com.example.kopidong

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Kopi : AppCompatActivity() {
    private lateinit var buttonarabikamocktail : Button
    private lateinit var buttonicesweetrobusta : Button
    private lateinit var buttonkopasusarabika : Button
    private lateinit var buttonkopijahecreamy : Button
    private lateinit var buttonkopiletok : Button
    private lateinit var buttonbobaliberica : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kopi)
        buttonarabikamocktail= findViewById(R.id.kopi_txt2)
        buttonicesweetrobusta = findViewById(R.id.kopi_txt3)
        buttonkopasusarabika = findViewById(R.id.kopi_txt4)
        buttonkopijahecreamy = findViewById(R.id.kopi_txt5)
        buttonkopiletok = findViewById(R.id.kopi_txt6)
        buttonbobaliberica = findViewById(R.id.kopi_txt7)

        buttonarabikamocktail.setOnClickListener{
            val move = Intent(this@Kopi, Arabikamocktail::class.java)
            startActivity(move)
        }
        buttonicesweetrobusta.setOnClickListener{
            val move = Intent(this@Kopi, Icesweetrobusta::class.java)
            startActivity(move)
        }
        buttonkopasusarabika.setOnClickListener{
            val move = Intent(this@Kopi, Kopasusarabika::class.java)
            startActivity(move)
        }
        buttonkopijahecreamy.setOnClickListener{
            val move = Intent(this@Kopi, Kopijahecreamy::class.java)
            startActivity(move)
        }
        buttonkopiletok.setOnClickListener{
            val move = Intent(this@Kopi, Kopiletok::class.java)
            startActivity(move)
        }
        buttonbobaliberica.setOnClickListener{
            val move = Intent(this@Kopi, Bobaliberica::class.java)
            startActivity(move)
        }
    }
}