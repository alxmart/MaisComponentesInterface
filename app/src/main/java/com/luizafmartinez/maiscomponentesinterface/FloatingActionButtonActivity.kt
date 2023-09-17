package com.luizafmartinez.maiscomponentesinterface

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.core.view.isVisible
import com.luizafmartinez.maiscomponentesinterface.databinding.ActivityFloatingActionButtonBinding

class FloatingActionButtonActivity : AppCompatActivity() {

    private val binding by lazy {
        ActivityFloatingActionButtonBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        with(binding) {
            fabBotao.setOnClickListener {

                groupMenu.visibility = if (groupMenu.isVisible) {
                    View.INVISIBLE
                } else {
                    View.VISIBLE
                }
            }
        }
    }
}