package com.example.aula04

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.ImageView
import android.widget.Spinner

class PokemonActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pokemon)

        val spinner: Spinner = findViewById(R.id.spinner)
        val imageView: ImageView = findViewById(R.id.imageView)
        val button: Button = findViewById(R.id.button)

        val pkms = arrayOf("Selecione", "Bulbassauro", "Charmander", "Squirtle")
        val adapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, pkms)
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spinner.adapter = adapter

        
    }
}