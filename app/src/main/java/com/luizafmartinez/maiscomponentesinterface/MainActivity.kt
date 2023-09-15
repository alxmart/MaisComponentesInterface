package com.luizafmartinez.maiscomponentesinterface

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private lateinit var btnClique: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnClique = findViewById(R.id.btn_clique)
        
        btnClique.setOnClickListener {
            Toast.makeText(this, "Olá", Toast.LENGTH_SHORT).show()
        }

        
    }
}