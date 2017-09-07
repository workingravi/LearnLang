package com.example.android.learnlang

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.ArrayAdapter
import android.widget.LinearLayout
import android.widget.ListView
import android.widget.TextView

class FamilyActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_family)

        var famWords = ArrayList<Word>()

        famWords.add(Word("English Word", "Kota Word"))
        famWords.add(Word("mother", "av"))
        famWords.add(Word("grandfather", "per-ayn"))
        famWords.add(Word("grandmother", "per-av"))
        famWords.add(Word("elder brother", "ann"))
        famWords.add(Word("elder sister", "akken"))
        famWords.add(Word("younger brother", "kada-l"))
        famWords.add(Word("younger sister", "kadas"))

        //Log.v("Family Activity", "word at INdex 0 is: " + famWords[0])

        //val rootView:LinearLayout = findViewById<LinearLayout>(R.id.famRoot)

        val itemAdapter = WordAdapter(this, famWords)
        val lv: ListView = findViewById(R.id.list_fam)
        lv.adapter = itemAdapter

/*
        for(index in famWords.indices) {
            val tvWordView = TextView(this)
            tvWordView.text = famWords[index]
            rootView.addView(tvWordView)
        }
*/
    }
}
