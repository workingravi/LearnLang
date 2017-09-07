package com.example.android.learnlang

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView
import kotlinx.android.synthetic.main.list_item.view.*

/**
 * Created by welcome on 9/3/2017.
 */
class WordAdapter(context: Context, wlist: ArrayList<Word>):ArrayAdapter<Word>(context, 0, wlist){

    private val mInflator: LayoutInflater
    init{
        this.mInflator = LayoutInflater.from(context)
    }
    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {

        val listViewItem: View

        val cur_word:Word = getItem(position)
        if(convertView == null){
            listViewItem = this.mInflator.inflate(R.layout.list_item, parent, false)
        }
        else {
            listViewItem = convertView
        }

        listViewItem.li1.text = cur_word.eWord
        listViewItem.li2.text = cur_word.kWord

        return listViewItem as View
    }
}