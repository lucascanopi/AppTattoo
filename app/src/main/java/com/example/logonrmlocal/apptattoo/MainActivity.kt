package com.example.logonrmlocal.apptattoo

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import kotlinx.android.synthetic.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val tattoos = ArrayList<AppTattoo>()
        tattoos.add(AppTattoo("Rosa","Pequena; Natureza"))
        tattoos.add(AppTattoo("Geralt","Games; Pessoas"))
        tattoos.add(AppTattoo("Ovelha","Animais; Simples"))

    }
}
