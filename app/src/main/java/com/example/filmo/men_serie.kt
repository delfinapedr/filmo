package com.example.filmo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class men_serie : AppCompatActivity() {
    fun irAMenuPrincipal(view: View) {
        val intent = Intent(this, men_principal::class.java)
        startActivity(intent)
    }
    fun irAFavoritos(view: View) {
        val intent = Intent(this, FavoritosActivity::class.java)
        startActivity(intent)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_men_serie)

        val botonHome = findViewById<Button>(R.id.botonSeries)
        botonHome.setOnClickListener {
            irAMenuPrincipal(it)
        }
        val botonFavoritos = findViewById<Button>(R.id.botonFavoritos)
        botonFavoritos.setOnClickListener {
            irAFavoritos(it)
        }
    }
}