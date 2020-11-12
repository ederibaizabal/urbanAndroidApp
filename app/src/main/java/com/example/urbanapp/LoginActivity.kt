package com.example.urbanapp

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
    }

    fun accionLogin(view: View){
        // En esta funcion el usuario iniciara sesion, habra que ver si el usuario existe,
        // si la contraseña es correcta, etc.
        // Tambien se cambiara de activity

        val intent = Intent(this, PrincipalActivity::class.java)

        startActivity(intent)


    }

    fun accionIrPaginaRegistro(view: View){
        // En esta funcion simplemente cambiamos el activity a la pagina de registro

        val intent = Intent(this, RegistroActivity::class.java)

        startActivity(intent)
    }
}