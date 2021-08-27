package com.example.android_viewpager2_example

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

class Page1Fragment : Fragment() {

    companion object {
        private var instance: Page1Fragment? = null
        fun getInstance(): Page1Fragment {
            if (instance == null) instance = Page1Fragment()
            return instance!!
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_page1, container, false)
    }

}