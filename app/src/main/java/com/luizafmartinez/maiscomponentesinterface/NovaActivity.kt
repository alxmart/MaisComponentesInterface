package com.luizafmartinez.maiscomponentesinterface

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.luizafmartinez.maiscomponentesinterface.databinding.ActivityNovaBinding
import com.luizafmartinez.maiscomponentesinterface.databinding.ActivityToolbarActionbarBinding

class NovaActivity : AppCompatActivity() {

    private val binding by lazy {
        ActivityNovaBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        inicializarToolbar()

    }

    private fun inicializarToolbar() {

        binding.includeToolbar.clLogo.visibility = View.GONE
        binding.includeToolbar.tbPrincipal.title = "Upload Vídeo"
        setSupportActionBar( binding.includeToolbar.tbPrincipal)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

    }

}