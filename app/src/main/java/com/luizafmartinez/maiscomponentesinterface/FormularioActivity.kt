package com.luizafmartinez.maiscomponentesinterface

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.luizafmartinez.maiscomponentesinterface.databinding.ActivityFormularioBinding

class FormularioActivity : AppCompatActivity() {

    private val binding by lazy {
        ActivityFormularioBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        with (binding) {

            btnEnviar.setOnClickListener {
                checkbox()
            }
        }

    }
    private fun checkbox() {
        val selecionado = binding.cbConfirmacao.isChecked
        binding.textResultado.text = "valor selecionado: $selecionado"
    }
}