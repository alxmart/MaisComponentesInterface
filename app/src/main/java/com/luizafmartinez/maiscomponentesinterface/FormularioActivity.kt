package com.luizafmartinez.maiscomponentesinterface

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.core.content.ContextCompat
import com.google.android.material.snackbar.Snackbar
import com.luizafmartinez.maiscomponentesinterface.databinding.ActivityFormularioBinding

class FormularioActivity : AppCompatActivity() {

    private val binding by lazy {
        ActivityFormularioBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        with(binding) {
            btnEnviar.setOnClickListener { view ->
                //checkbox()
                //radioButton()
                //switchToggle()
                exibirSnackBar(view)
                //Snackbar precisa de uma View
                /*Snackbar.make(
                   view,
                   "Alteração efetuada com sucesso",
                   Snackbar.LENGTH_LONG
                ).show()*/

            }

            //switchNotificacoes.setOnClickListener {
            /*
            toggleAtivo.setOnClickListener {

            }
            toggleAtivo.setOnCheckedChangeListener { buttonView, isChecked ->

            }
            */

            /*cbConfirmacao.setOnCheckedChangeListener { _, isChecked ->
                val resultado = if (isChecked) "Sim" else "Não"
                binding.textResultado.text = "valor selecionado: $resultado"
            }*/

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

    private fun exibirSnackBar(view: View) {
        val snackBar = Snackbar.make(
            view,
            "Alteração efetuada com sucesso",
            Snackbar.LENGTH_LONG
        )

        snackBar.setAction("Desfazer") {
            Toast.makeText(this, "Desfeito", Toast.LENGTH_SHORT).show()
        }

        snackBar.setTextColor(
            ContextCompat.getColor(
                this,
                android.R.color.black
            )
        )

        snackBar.setActionTextColor(
            ContextCompat.getColor(
                this,
                R.color.purple
            )
        )

        snackBar.setBackgroundTint(
            ContextCompat.getColor(
                this,
                android.R.color.holo_orange_dark
            )
        )



        snackBar.show()
    }

    private fun switchToggle() {

        val switchMarcado = binding.switchNotificacoes.isChecked
        val toggleMarcado = binding.toggleAtivo.isChecked

        val texto = "Switch: $switchMarcado toggle: $toggleMarcado"
        binding.textResultado.text = texto
    }

    private fun radioButton() {
        val masculino = binding.rbMasculino.isChecked
        //binding.textResultado.text = if (masculino) "Masculino" else "Feminino"

        val idItemSelecionado = binding.rgSexo.checkedRadioButtonId
        binding.textResultado.text = when( idItemSelecionado ) {
            R.id.rbMasculino -> "Masculino"
            R.id.rbFeminino -> "Feminino"
            else -> "Nada selecionado"
        }

        binding.rgSexo.clearCheck()
    }

    private fun checkbox() {
        val selecionado = binding.cbConfirmacao.isChecked
        val resultado = if (selecionado) "Sim" else "Não"
        binding.textResultado.text = "valor selecionado: $resultado"
    }

}