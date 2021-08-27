package com.example.android_viewpager2_example

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import androidx.viewpager2.widget.ViewPager2

class MainActivity : AppCompatActivity() {

    private lateinit var activityMainViewpager2Pager: ViewPager2

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        activityMainViewpager2Pager = findViewById(R.id.activity_main_viewpager2_pager)

        activityMainViewpager2Pager.adapter = ScreenSlidePagerAdapter(this)
    }

    class ScreenSlidePagerAdapter(fa: FragmentActivity) : FragmentStateAdapter(fa) {
        override fun getItemCount(): Int = 3
        override fun createFragment(position: Int): Fragment = when (position) {
            0 -> Page1Fragment.getInstance()
            1 -> Page2Fragment.getInstance()
            2 -> Page3Fragment.getInstance()
            else -> throw ArrayIndexOutOfBoundsException()
        }
    }

}