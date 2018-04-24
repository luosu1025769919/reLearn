package com.luosu.adapter

import android.content.Context
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.luosu.relearn.R

/**
 * Created by 落苏 on 2018/4/8.
 */
class listviewAdapter(list: MutableList<Int>, context: Context) : MyBaseAdapter<Int>(list, context) {
    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        var holder: ViewHolder
        var view: View

        if (convertView == null) {
            holder = ViewHolder()
            view = View.inflate(context, R.layout.item_recycle, null)
            view.setTag(holder)

        } else {
            holder = convertView.getTag() as ViewHolder
            view = convertView
            holder = view.getTag() as ViewHolder
        }


        holder.tv_msg = view.findViewById(R.id.tv_item) as TextView
        holder.tv_msg.setText("你好-------" + position)
        return view
    }

    inner class ViewHolder {
        public lateinit var tv_msg: TextView;

    }

}