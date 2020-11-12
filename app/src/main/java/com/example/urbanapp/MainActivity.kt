package com.example.urbanapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    // fun es una palabra reservada para crear funciones en Kotlin
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun accionEntrar(view: View){

        val intent = Intent(this, LoginActivity::class.java)

        startActivity(intent)
    }

}