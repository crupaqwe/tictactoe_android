package com.example.tictactoespele

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

lateinit var button : Button
lateinit var button2 : Button

class MainMenu : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_menu)
        supportActionBar?.hide() // lai pasleptu title bar


        button = findViewById(R.id.button)
        button2 = findViewById(R.id.button2)

        button.setOnClickListener {
            finish()
            val intent1 = Intent(this,MainActivity::class.java)
            startActivity(intent1)
        }
        button2.setOnClickListener {
            finish()
            val intent = Intent(this,MainActivityCPU::class.java)
            startActivity(intent)
        }


    }
}