package ru.shadowsparky.tabs

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter

open class TabAdapter(
                val manager: FragmentManager,
                private val tab_count: Int
) : FragmentStatePagerAdapter(manager) {

    override fun getItem(position: Int): Fragment {
        var fragment: Fragment? = null
        when(position) {
            0 -> fragment = OneTab()
            1 -> fragment = TwoTab()
        }
        return fragment!!
    }

    override fun getCount(): Int {
        return tab_count
    }

}