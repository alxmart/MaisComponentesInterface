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

        with(binding) {

            btnEnviar.setOnClickListener {
                //checkbox()
            }

            cbConfirmacao.setOnCheckedChangeListener { _, isChecked ->
                val resultado = if (isChecked) "Sim" else "Não"
                binding.textResultado.text = "valor selecionado: $resultado"
            }

           /* cbConfirmacao.setOnCheckedChangeListener { _, isChecked ->
                var textLabel = if (cbConfirmacao.isChecked)
                    "Sim, desejo receber emails"
                else
                    "Não , prefiro não receber emails"
                cbConfirmacao.text = textLabel
            }*/


            /*cbConfirmacao.setOnClickListener {
                val selecionado = binding.cbConfirmacao.isChecked
                val resultado = if (selecionado) "Sim" else "Não"
                binding.textResultado.text = "valor selecionado: $resultado"
            }*/
        }
    }

    private fun checkbox() {
        val selecionado = binding.cbConfirmacao.isChecked
        val resultado = if (selecionado) "Sim" else "Não"
        binding.textResultado.text = "valor selecionado: $resultado"
    }
}