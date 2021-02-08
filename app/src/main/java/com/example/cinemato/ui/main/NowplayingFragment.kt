package com.example.cinemato.ui.main

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.cinemato.R
import kotlinx.android.synthetic.main.ongoing_fragment.view.*

class NowplayingFragment: Fragment() {
   /*
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        //return super.onCreateView(inflater, container, savedInstanceState)
        return inflater.inflate(R.layout.)
    }
    */
   override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                             savedInstanceState: Bundle?): View {
       return inflater.inflate(R.layout.nowplaying_fragment, container, false)
   }

}