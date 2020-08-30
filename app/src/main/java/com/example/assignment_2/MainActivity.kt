package com.example.assignment_2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.tabs.TabLayout.*
import com.google.android.material.tabs.TabLayoutMediator
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        toolBar.setTitle("Assignment-2")
        setSupportActionBar(toolBar)

        val fragmentAdapter = PagerAdapter(supportFragmentManager, lifecycle)
        viewPager2.adapter = fragmentAdapter

        TabLayoutMediator(tabLayout, viewPager2) { tab, position ->
            tab.text = fragmentAdapter.getPageTitle(position)
            viewPager2.setCurrentItem(tab.position, true)
        }.attach()

    }

}

