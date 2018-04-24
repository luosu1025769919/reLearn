package com.luosu.adapter

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.luosu.relearn.R

/**
 * Created by 落苏 on 2018/4/8.
 */
class RecycleAdapter(list: MutableList<Int>, context: Context) : RecyclerView.Adapter<RecycleAdapter.ViewHolder>() {
    private lateinit var list: MutableList<Int>
    private lateinit var context: Context

    init {
        this.list = list
        this.context = context
    }

    override fun getItemCount(): Int {
        return list.size ?: 0
    }

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): ViewHolder {
        var view = View.inflate(context, R.layout.item_recycle, null)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder?, position: Int) {
        holder!!.tv_msg.setText("你好________---------" + position)
    }

    class ViewHolder(itemview: View) : RecyclerView.ViewHolder(itemview) {
        internal var tv_msg: TextView = itemview.findViewById(R.id.tv_item) as TextView


    }


}