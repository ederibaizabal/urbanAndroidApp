package com.example.urbanapp

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class RegistroActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registro)
    }

    fun accionRegistrarse(view: View){
        // Esta funcion recoge todos los datos de un nuevo usuario y los almacena
        // Hay que tener en cuenta que todos los datos sean correctos, no se creen
        // cuentas iguales,etc.

        // Ademas de eso se cambia el activity a login

        val intent = Intent(this, LoginActivity::class.java)

        startActivity(intent)
    }
}