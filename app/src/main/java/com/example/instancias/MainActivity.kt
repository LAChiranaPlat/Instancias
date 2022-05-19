package com.example.instancias

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    var n=0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        if(savedInstanceState != null){
            n= savedInstanceState.getString("puntaje")!!.toInt()
            findViewById<TextView>(R.id.screen).setText(n.toString())
        }

    }

    fun plus(v: View){

        n++
        findViewById<TextView>(R.id.screen).text= n.toString()

    }

    override fun onSaveInstanceState(outState: Bundle) {

        super.onSaveInstanceState(outState)
        outState.putString("puntaje",findViewById<TextView>(R.id.screen).text.toString())

    }

}