package com.example.contohfragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.viewpager.widget.ViewPager
import com.example.contohfragment.Home.DisneyFragment
import com.example.contohfragment.Home.FabelFragment
import com.example.contohfragment.Home.LegendaFragment
import com.google.android.material.tabs.TabLayout

class HomeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {




        val view = inflater.inflate(R.layout.fragment_home, container, false)
        val viewPager = view.findViewById<ViewPager>(R.id.viewPager)
        val tabLayout = view.findViewById<TabLayout>(R.id.tablayout)

        val fragmentAdapter = FragmentAdapter(childFragmentManager)
        fragmentAdapter.addFragment(LegendaFragment(), "Legenda")
        fragmentAdapter.addFragment(DisneyFragment(), "Disney")
        fragmentAdapter.addFragment(FabelFragment(), "Fabel")

        viewPager.adapter = fragmentAdapter
        tabLayout.setupWithViewPager(viewPager)

        val actionBar = (requireActivity() as AppCompatActivity).supportActionBar
        actionBar?.title = "Home"

        return view
    }


}
