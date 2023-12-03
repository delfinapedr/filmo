package com.example.filmo

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.RelativeLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    fun irACrearCuenta(view: View) {
        val intent = Intent(this, men_crearCuenta::class.java)
        startActivity(intent)
    }
    fun irAMenuPrincipal(view: View) {
        val intent = Intent(this, men_principal::class.java)
        startActivity(intent)
    }
    fun irAMenPerfil(view:View) {
        val intent = Intent(this, men_perfil::class.java)
        startActivity(intent)
    }
    fun irAModPerfil(view: View) {
        val intent = Intent(this, menu_modificar_perfil::class.java)
        startActivity(intent)
    }
    @SuppressLint("MissingInflatedId", "SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Asignar valores a las vistas
        val logo = findViewById<ImageView>(R.id.logo)
        logo.setImageResource(R.drawable.logo)

        val imagenUsuario1 = findViewById<ImageView>(R.id.imagenUsuario1)
        imagenUsuario1.setImageResource(R.drawable.usuario1)

        val textoNombreUsuario1 = findViewById<TextView>(R.id.textoNombreUsuario1)

        val imagenUsuario2 = findViewById<ImageView>(R.id.imagenUsuario2)
        imagenUsuario2.setImageResource(R.drawable.usuario2)

        val textoNombreUsuario2 = findViewById<TextView>(R.id.textoNombreUsuario2)


        val textoEresNuevo = findViewById<Button>(R.id.buttonRegister1)
        textoEresNuevo.setOnClickListener {
            irACrearCuenta(it)
        }

        val botonIniciarSesion = findViewById<Button>(R.id.buttonLogin1)
        botonIniciarSesion.setOnClickListener {
            irAMenPerfil(it) // 'it' hace referencia al objeto View que ha desencadenado el evento click
        }

        imagenUsuario1.setOnClickListener {
            irAMenuPrincipal(it)
        }
        textoNombreUsuario1.setOnClickListener {
            irAMenuPrincipal(it)
        }
        imagenUsuario2.setOnClickListener {
            irAMenuPrincipal(it)
        }
        textoNombreUsuario2.setOnClickListener {
            irAMenuPrincipal(it)
        }


    }


}