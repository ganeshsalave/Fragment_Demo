package com.example.mahesh.fragmenttest

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun load(v:View)
    {
        when(v.id){
            R .id.home->{
                var fManager=fragmentManager
                var tx=fManager.beginTransaction()
                tx.replace(R.id.frag1,HomeFragment())
                tx.commit()
            }
            R .id.cources->{
                var fManager=fragmentManager
                var tx=fManager.beginTransaction()
                tx.replace(R.id.frag1,CourcesFragment())
                tx.commit()
            }
            R .id.materials->{
                var fManager=fragmentManager
                var tx=fManager.beginTransaction()
                tx.replace(R.id.frag1,MaterialFragment())
                tx.commit()
            }
            R .id.projects->{
                var fManager=fragmentManager
                var tx=fManager.beginTransaction()
                tx.replace(R.id.frag1,ProjectFragment())
                tx.commit()
            }
        }



    }
}
