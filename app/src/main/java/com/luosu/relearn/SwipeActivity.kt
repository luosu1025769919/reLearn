package com.luosu.relearn

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import com.luosu.adapter.MyswipeAdapter
import com.luosu.bean.Message
import org.xutils.view.annotation.ContentView
import org.xutils.view.annotation.ViewInject
import org.xutils.x

@ContentView(R.layout.activity_swipe)
class SwipeActivity : AppCompatActivity() {
    @ViewInject(R.id.recycle)
    internal lateinit var recycle: RecyclerView
    internal lateinit var swipeadapter: MyswipeAdapter
    internal lateinit var list: MutableList<Message>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        x.view().inject(this)
        list= mutableListOf();
        for ( i in 1..10){
            list.add(Message("标题"+i,"文字","短标题"))

        }

        swipeadapter= MyswipeAdapter(list)
        recycle.layoutManager= LinearLayoutManager(this@SwipeActivity)
        recycle.adapter= swipeadapter


    }
}
