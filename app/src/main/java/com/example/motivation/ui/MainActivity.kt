package com.example.motivation.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.motivation.infrastructure.MotivationConstants
import com.example.motivation.R
import com.example.motivation.infrastructure.SecurityPreferences
import com.example.motivation.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //Esconder a actionBar
        supportActionBar?.hide()

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //Chamando a função que recupera o nome do usuário
        handleUserName()

        //Eventos
        binding.buttonNewPhrase.setOnClickListener(this)
    }

    //Botão que adiciona uma nova frase
    override fun onClick(view: View) {
        if (view.id == R.id.button_new_phrase) {
            var s = ""
        }
    }

    //Recuperando o nome do usuário que foi salvo na classe SecurityPreferences
    private fun handleUserName() {
        val name = SecurityPreferences(this).getString(MotivationConstants.KEY.USER_NAME)
        binding.textUserName.text = "Olá, $name!"
    }
}