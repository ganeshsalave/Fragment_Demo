package com.example.mahesh.fragmenttest

import android.app.Fragment
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

class HomeFragment:Fragment()
{
    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View {
        var v = inflater?.inflate(R.layout.home_layout,
                container,false)
        return v!!

    }
}