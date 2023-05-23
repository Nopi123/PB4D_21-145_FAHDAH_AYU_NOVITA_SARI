package com.example.contohfragment

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class DisneyFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_disney, container, false)

        val button = view.findViewById<Button>(R.id.Buttondisney1)
        button.setOnClickListener {
            val intent = Intent(activity, DetailSatuDisney::class.java)
            activity?.startActivity(intent)
        }
        return view

    }

}
