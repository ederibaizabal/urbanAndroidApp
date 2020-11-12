package com.example.urbanapp

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class PrincipalActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_principal)
    }

    fun accionReservar(view: View){
        val intent = Intent(this, ReservarActivity::class.java)

        startActivity(intent)
    }

    fun accionSalir(view: View){
        val intent = Intent(this, MainActivity::class.java)

        startActivity(intent)
    }
}