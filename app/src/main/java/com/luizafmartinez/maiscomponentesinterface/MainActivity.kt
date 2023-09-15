package com.luizafmartinez.maiscomponentesinterface

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import com.luizafmartinez.maiscomponentesinterface.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    //private lateinit var btnClique: Button

    //private lateinit var binding: ActivityMainBinding
    private val binding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)

        //binding = ActivityMainBinding.inflate( layoutInflater )
        setContentView(binding.root)

        with (binding) {

            btnClique.setOnClickListener { }
            btnExecutar?.setOnClickListener { }
        }

        /*btnClique = findViewById(R.id.btn_clique)
        btnClique.setOnClickListener {
            Toast.makeText(this, "Olá", Toast.LENGTH_SHORT).show()
        }*/
    }
}