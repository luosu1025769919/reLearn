package com.luosu.adapter

import android.support.v7.widget.RecyclerView
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.daimajia.swipe.adapters.RecyclerSwipeAdapter
import com.luosu.bean.Message
import com.luosu.relearn.R

/**
 * Created by 落苏 on 2018/4/19.
 */
class MyswipeAdapter(list: List<Message>) : RecyclerSwipeAdapter<MyswipeAdapter.MyViewHolder>() {
    internal lateinit var list: List<Message>

    init {
        this.list = list
    }

    override fun onBindViewHolder(viewHolder: MyViewHolder?, position: Int) {
        var msg = list[position]
        viewHolder!!.tv_title.setText(msg.title)
        viewHolder!!.tv_message.setText(msg.msg)
        viewHolder!!.tv_text.setText(msg.text)

    }

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): MyViewHolder {

        return MyViewHolder(View.inflate(parent!!.context, R.layout.item_swipe, null))
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun getSwipeLayoutResourceId(position: Int): Int {
        return position
    }

    class MyViewHolder(itemview: View) : RecyclerView.ViewHolder(itemview) {
        internal var tv_title: TextView = itemview.findViewById(R.id.tv_title) as TextView
        internal var tv_message: TextView = itemview.findViewById(R.id.tv_message) as TextView
        internal var tv_text: TextView = itemview.findViewById(R.id.tv_text) as TextView

    }

}