package com.luosu.relearn

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.support.v7.widget.RecyclerView.Adapter
import android.view.View
import android.view.ViewGroup
import android.widget.ListView
import android.widget.TextView
import com.luosu.adapter.RecycleAdapter
import com.luosu.adapter.listviewAdapter
import org.xutils.view.annotation.ContentView
import org.xutils.view.annotation.ViewInject
import org.xutils.x

@ContentView(R.layout.activity_listview)
class ListviewActivity : AppCompatActivity() {
    @ViewInject(R.id.recycle)
    internal lateinit var recycle: RecyclerView
    @ViewInject(R.id.listview)
    internal lateinit var listview: ListView
    internal lateinit var list: MutableList<Int>
    internal lateinit var adapter: RecycleAdapter
    internal lateinit var lvadapter: listviewAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        x.view().inject(this)
        list = mutableListOf();
        for (i in 1..7) {
            list.add(i)
        }
        adapter = RecycleAdapter(list, this@ListviewActivity)
        lvadapter = listviewAdapter(list, this@ListviewActivity)
        var manger = LinearLayoutManager(this)
        manger.orientation = LinearLayoutManager.HORIZONTAL
        recycle.layoutManager = manger

        recycle.adapter = adapter
        listview.adapter = lvadapter


    }

    inner class TestAdapter : Adapter<TestAdapter.ViewHolder>() {

        override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): ViewHolder {
            var view = View.inflate(this@ListviewActivity, R.layout.item_recycle, null)
            var holder: ViewHolder = ViewHolder(view)

            return holder
        }

        override fun onBindViewHolder(holder: ViewHolder?, position: Int) {
            holder!!.tv_item.setText("" + holder!!.tv_item.text + "---------" + position.toString())
        }

        override fun getItemCount(): Int {
            return list.size ?: 0;
        }

        inner class ViewHolder(itemView: View?) : RecyclerView.ViewHolder(itemView) {
            public var tv_item: TextView = itemView!!.findViewById(R.id.tv_item) as TextView


        }
    }


}
