package com.dam2.basica

import android.content.Intent
import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import android.view.View


import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.content_main.*
import org.jetbrains.anko.browse
import org.jetbrains.anko.design.snackbar
import org.jetbrains.anko.intentFor
import org.jetbrains.anko.toast
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)

        fab.setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show()
        }


        botonsaludo.setOnClickListener{
            textoSaludo.setText("Hola que tal")

        }

        tostada.setOnClickListener{
            toast("HOLA!!!")
            it.snackbar("MUEREEEEEEEEEEEE")
        }


        //val intent = Intent(this, CambiarColores::class.java)
       // intent.putExtra("color", "Amarillo")
    //    startActivity(intent)




    }

    fun cambiarRojo(v : View){
        startActivity(intentFor<CambiarColores>("color" to "Rojo"))
    }

    fun cambiarAmarillo(v : View){
        startActivity(intentFor<CambiarColores>("color" to "Amarillo"))
    }

    fun iraInternet(v:View){
        browse("https://euw.leagueoflegends.com/es/")
    }
    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        return when (item.itemId) {
            R.id.action_settings -> true
            else -> super.onOptionsItemSelected(item)
        }
    }
}
