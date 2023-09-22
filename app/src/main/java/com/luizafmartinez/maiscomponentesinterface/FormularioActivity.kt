package com.luizafmartinez.maiscomponentesinterface

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
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

        spinnerExibicao()

        with(binding) {
            btnEnviar.setOnClickListener { view ->
                //checkbox()
                //radioButton()
                //switchToggle()
                //exibirSnackBar(view)
                //Snackbar precisa de uma View
                /*Snackbar.make(
                   view,
                   "Alteração efetuada com sucesso",
                   Snackbar.LENGTH_LONG
                ).show()*/
                //caixaDialogAlerta()
                spinnerSelecionarItem()

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

    private fun spinnerSelecionarItem() {

        val itemSelecionado = binding.spinnerCategorias.selectedItem
        val itemPosicao = binding.spinnerCategorias.selectedItemPosition

        if ( itemPosicao == 0) {
            binding.textResultado.text = "Selecione um item"
        } else {
            binding.textResultado.text =
                "Selecionado: $itemSelecionado - Pos: $itemPosicao"
        }
    }


    private fun spinnerExibicao() {

        val categorias = listOf(
            "Selecione uma categoria:",
            "Eletrônicos", "Roupas", "Móveis", "Sapatos"
        )
        binding.spinnerCategorias.adapter = ArrayAdapter(
            this,
            android.R.layout.simple_spinner_dropdown_item,
            categorias
        )
    }


    private fun caixaDialogAlerta() {
        AlertDialog.Builder(this)
            .setTitle("Confirmar exclusão do item")
            .setMessage("Tem certeza que quer remover ?")
            .setNegativeButton("Cancelar") { dialog, posicao ->
                Toast.makeText(this, "Cancelar ($posicao)", Toast.LENGTH_SHORT).show()
                //dialog.dismiss()
            }
            .setPositiveButton("Remover") { dialog, posicao ->
                Toast.makeText(this, "Remover ($posicao)", Toast.LENGTH_SHORT).show()
                //dialog.dismiss()
            }
            .setNeutralButton("ajuda") { dialog, posicao ->
            Toast.makeText(this, "Ajuda ($posicao)", Toast.LENGTH_SHORT).show()
        }
            .setIcon(R.drawable.ic_alerta_24)
            .setCancelable(false) //Usuario tem que clicar em Cancelar ou Remover
            .create()
            .show()

       /*
       val alertBuilder = AlertDialog.Builder(this)

        alertBuilder.setTitle("Confirmar exclusão do item")

        alertBuilder.setMessage("Tem certeza que quer remover ?")

        alertBuilder.setNegativeButton("Cancelar") { dialog, posicao ->
            Toast.makeText(this, "Cancelar ($posicao)", Toast.LENGTH_SHORT).show()
            //dialog.dismiss()
        }

        alertBuilder.setPositiveButton("Remover") { dialog, posicao ->
            Toast.makeText(this, "Remover ($posicao)", Toast.LENGTH_SHORT).show()
            //dialog.dismiss()
        }

        alertBuilder.setCancelable(false) //Usuario tem que clicar em CAncelar ou Remover   alertBuilder.setNeutralButton()

        alertBuilder.setNeutralButton("ajuda") { dialog, posicao ->
            Toast.makeText(this, "Ajuda ($posicao)", Toast.LENGTH_SHORT).show()
        }

        alertBuilder.setIcon(R.drawable.ic_alerta_24)

        val alertDialog = alertBuilder.create()

        alertDialog.show()
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
        */
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