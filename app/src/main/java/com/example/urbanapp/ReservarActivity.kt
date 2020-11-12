package com.example.urbanapp

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity

class ReservarActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_reservar)

        var listView = findViewById<ListView>(R.id.listViewHoras)

        var lista = ArrayList<String>()

        lista.add("8:00-8:30")
        lista.add("8:30-9:00")
        lista.add("9:00-9:30")
        lista.add("9:30-10:00")
        lista.add("10:00-10:30")
        lista.add("11:00-11:30")
        lista.add("11:30-12:00")
        lista.add("16:00-16:30")
        lista.add("18:00-18:30")

        var arrayAdapter = ArrayAdapter(this,android.R.layout.simple_list_item_1,lista)

        listView.adapter = arrayAdapter

    }



    fun accionConfirmar(view: View){

        val intent = Intent(this, PrincipalActivity::class.java)

        startActivity(intent)
    }
}