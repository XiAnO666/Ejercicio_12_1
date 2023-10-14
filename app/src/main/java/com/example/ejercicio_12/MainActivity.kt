package com.example.ejercicio_12

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val botonToast = findViewById<Button>(R.id.button)

        botonToast.setOnClickListener{
            Toast.makeText(this, "Registro Completado", Toast.LENGTH_SHORT).show()
        }
    }

}