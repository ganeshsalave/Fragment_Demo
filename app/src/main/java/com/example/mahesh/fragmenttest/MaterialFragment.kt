package com.example.mahesh.fragmenttest

import android.app.Fragment
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MaterialFragment:Fragment()
{
    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View {
        var v = inflater?.inflate(R.layout.material_layout,
                container,false)
       var e1=v!!.findViewById<EditText>(R.id.et1)
      var b1=v.findViewById<Button>(R.id.b1)
        b1.setOnClickListener({
            Toast.makeText(activity, e1.text.toString(), Toast.LENGTH_LONG).show()
        })
        return v

    }
}