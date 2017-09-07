package com.example.android.learnlang

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun openFamilyActivity(view: View){
        var i = Intent(this, FamilyActivity::class.java)
        startActivity(i)
    }
}
