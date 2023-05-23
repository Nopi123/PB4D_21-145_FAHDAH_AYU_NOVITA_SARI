package com.example.contohfragment.Home

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import com.example.contohfragment.R
import com.example.contohfragment.detail.DetailSatuFabel

class FabelFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {





        val view = inflater.inflate(R.layout.fragment_fabel, container, false)

        val button = view.findViewById<Button>(R.id.Buttonfabel1)
        button.setOnClickListener {
            val intent = Intent(activity, DetailSatuFabel::class.java)
            activity?.startActivity(intent)
        }
        return view
    }

}
