package ru.shadowsparky.tabs

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TabHost
import android.widget.Toast
import androidx.fragment.app.FragmentManager
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayout.GRAVITY_FILL
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tab_layout.addTab(tab_layout.newTab().setText("tab 1"))
        tab_layout.addTab(tab_layout.newTab().setText("tab 2"))
        tab_layout.tabGravity = GRAVITY_FILL
        val adapter = TabAdapter(supportFragmentManager, tab_layout.tabCount)
        pager.adapter = adapter
        pager.addOnPageChangeListener(TabLayout.TabLayoutOnPageChangeListener(tab_layout))
        tab_layout.addOnTabSelectedListener(object:TabLayout.OnTabSelectedListener {
            override fun onTabReselected(p0: TabLayout.Tab) {
                pager.currentItem = p0.position
            }

            override fun onTabUnselected(p0: TabLayout.Tab?) {
            }

            override fun onTabSelected(p0: TabLayout.Tab?) {
            }
        })
    }
}
