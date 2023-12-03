package com.example.filmo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class men_crearCuenta : AppCompatActivity() {
    fun irAMenuPrincipal(view: View) {
        val intent = Intent(this, men_principal::class.java)
        startActivity(intent)
    }
    fun irAMenPerfil(view: View) {
        val intent = Intent(this, men_perfil::class.java)
        startActivity(intent)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_men_crear_cuenta)

        val botonCrearCuenta = findViewById<Button>(R.id.buttonSignUp)
        botonCrearCuenta.setOnClickListener{
            irAMenuPrincipal(it)
        }
        val textoYaTieneCuenta = findViewById<TextView>(R.id.textViewSignIn)
        textoYaTieneCuenta.setOnClickListener{
            irAMenPerfil(it)
        }
    }
}