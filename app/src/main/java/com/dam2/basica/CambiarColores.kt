package com.dam2.basica

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_cambiar_colores.*

class CambiarColores : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cambiar_colores)

        val valor = intent.getStringExtra("color")
        textoColores.setText(valor)


    }


}
