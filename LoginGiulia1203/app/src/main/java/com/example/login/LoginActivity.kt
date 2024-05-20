package com.example.login

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.login.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {

    private lateinit var binding:ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonEntrar.setOnClickListener {
            val username = binding.editNome.text.toString().trim()
            val password = binding.editSenha.text.toString().trim()

            if (username.equals("Giulia") && password.equals("12")) {
                val i = Intent(this, MainActivity::class.java)
                i.putExtra("nome", username)
                startActivity(i)
                finish()
            } else {
                Toast.makeText(applicationContext, "Errou", Toast.LENGTH_LONG).show()
            }
        }

    }
}