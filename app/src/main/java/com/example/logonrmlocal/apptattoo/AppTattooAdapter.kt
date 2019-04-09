package com.example.logonrmlocal.apptattoo

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView

abstract class AppTattooAdapter(val context: Context, val tattoos: ArrayList<AppTattoo>) : BaseAdapter() {
    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        var tela : View = LayoutInflater.from(context).inflate(R.layout.item, parent, false)
        var tattoo : TextView = tela.findViewById(R.id.tattoo);
        var tipo : TextView = tela.findViewById(R.id.tipo)
        tattoo.text = tattoos.get(position).tipo
        return tela
    }

    override fun getItem(position: Int): Any{
        return tattoos.get(position)
    }

    override fun getItemId(position: Int): Long{
        return position.toLong()
    }
}