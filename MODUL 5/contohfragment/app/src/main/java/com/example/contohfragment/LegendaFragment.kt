package com.example.contohfragment

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button


class LegendaFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.fragment_legenda, container, false)

        val button1 = view.findViewById<Button>(R.id.Button1)
        button1.setOnClickListener {
            val intent = Intent(activity, DetailSatu::class.java)
            activity?.startActivity(intent)
        }

        val button2 = view.findViewById<Button>(R.id.Button2)
        button2.setOnClickListener {
            val intent = Intent(activity, DetailDuaLegenda::class.java)
            activity?.startActivity(intent)
        }

        return view
    }
}





































