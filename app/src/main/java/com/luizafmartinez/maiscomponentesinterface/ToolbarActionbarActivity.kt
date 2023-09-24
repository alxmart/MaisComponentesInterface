package com.luizafmartinez.maiscomponentesinterface

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.widget.Toast
import androidx.core.content.ContextCompat
import androidx.core.view.MenuProvider
import com.luizafmartinez.maiscomponentesinterface.databinding.ActivityToolbarActionbarBinding

class ToolbarActionbarActivity : AppCompatActivity() {

    private val binding by lazy {
        ActivityToolbarActionbarBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        inicializarToolbar()

        //supportActionBar?.hide()
        //inicializarActionBar()
    }

    private fun inicializarToolbar() {

        binding.btnAbrirnova.setOnClickListener {
            startActivity(Intent(this, NovaActivity::class.java))
        }

        binding.includeToolbar.tbPrincipal.title = "YouTube"
        binding.includeToolbar.tbPrincipal.setTitleTextColor(
            ContextCompat.getColor(this, R.color.white)
        )

      /*  binding.tbPrincipal.inflateMenu(R.menu.menu_principal)
        binding.tbPrincipal.setOnMenuItemClickListener { menuItem ->
            when (menuItem.itemId) {
                R.id.item_adicionar -> {
                    Toast.makeText(applicationContext, "Adicionar", Toast.LENGTH_SHORT).show()
                    return@setOnMenuItemClickListener true
                }

                R.id.item_pesquisar -> {
                    Toast.makeText(applicationContext, "Pesquisar", Toast.LENGTH_SHORT).show()
                    return@setOnMenuItemClickListener true
                }

                R.id.item_configuracoes -> {
                    Toast.makeText(applicationContext, "Configurações", Toast.LENGTH_SHORT).show()
                    return@setOnMenuItemClickListener true
                }

                R.id.item_sair -> {
                    Toast.makeText(applicationContext, "Sair", Toast.LENGTH_SHORT).show()
                    return@setOnMenuItemClickListener true
                }

                else -> {
                    true
                }
            }
        }*/

        //binding.tbPrincipal.subtitle = "Mais detalhes"

        setSupportActionBar( binding.includeToolbar.tbPrincipal )
        inicializarActionBar()
    }

    private fun inicializarActionBar() {

        addMenuProvider(
            object : MenuProvider {
                override fun onCreateMenu(menu: Menu, menuInflater: MenuInflater) {
                    menuInflater.inflate(R.menu.menu_principal, menu)
                }

                override fun onMenuItemSelected(menuItem: MenuItem): Boolean {

                    when (menuItem.itemId) {
                        R.id.item_adicionar -> {
                            Toast.makeText(applicationContext, "Adicionar", Toast.LENGTH_SHORT)
                                .show()
                        }

                        R.id.item_pesquisar -> {
                            Toast.makeText(applicationContext, "Pesquisar", Toast.LENGTH_SHORT)
                                .show()
                        }

                        R.id.item_configuracoes -> {
                            Toast.makeText(applicationContext, "Configurações", Toast.LENGTH_SHORT)
                                .show()
                        }

                        R.id.item_sair -> {
                            Toast.makeText(applicationContext, "Sair", Toast.LENGTH_SHORT).show()
                        }
                    }
                    return true
                }
            }
        )
    }

    /*override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_principal, menu)
        return true
    }*/

    /*override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when ( item.itemId ) {
            R.id.item_adicionar -> {
                Toast.makeText(this, "Adicionar", Toast.LENGTH_SHORT).show()
            }
            R.id.item_pesquisar -> {
                Toast.makeText(this, "Pesquisar", Toast.LENGTH_SHORT).show()
            }
            R.id.item_configuracoes -> {
                Toast.makeText(this, "Configurações", Toast.LENGTH_SHORT).show()
            }
            R.id.item_sair -> {
                Toast.makeText(this, "Sair", Toast.LENGTH_SHORT).show()
            }
        }
        return true
    }*/

}