package com.example.assignment_2

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.viewpager2.adapter.FragmentStateAdapter
import androidx.lifecycle.Lifecycle

class PagerAdapter (fm: FragmentManager, lifecycle: Lifecycle) : FragmentStateAdapter(fm, lifecycle) {
    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0-> {
                Rock()
            }
            1->Classic()
            else->{
                return Pop()
            }
        }
    }

    override fun getItemCount(): Int {
        return 3
    }

    fun getPageTitle(position: Int): CharSequence? {
        return when (position) {
            0->"Rock"
            1->"Classic"
            else->{
                return "Pop"
            }
        }
    }
}