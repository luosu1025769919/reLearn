package com.luosu.adapter

import android.content.Context
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter

/**
 * Created by 落苏 on 2018/4/8.
 */
abstract class MyBaseAdapter<T>(list: MutableList<T>, context: Context) : BaseAdapter() {
    internal lateinit var list: MutableList<T>
    internal lateinit var context: Context

    init {
        this.list = list
        this.context = context
    }

    override abstract fun getView(position: Int, convertView: View?, parent: ViewGroup?): View


    override fun getItem(position: Int): T {
        return list[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getCount(): Int {
        return list.size ?: 0
    }


}