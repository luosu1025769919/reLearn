package com.luosu.relearn

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import org.xutils.view.annotation.ContentView
import org.xutils.view.annotation.Event
import org.xutils.x

@ContentView(R.layout.activity_first)
class FirstActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        x.view().inject(this)
    }

    @Event(type = View.OnClickListener::class, value = R.id.btn_gotolistview)
    fun gotolistview(v: View) {
        startActivity(Intent(this@FirstActivity, ListviewActivity::class.java))
    }

    @Event(type = View.OnClickListener::class, value = R.id.btn_chart)
    fun gotochart(v: View) {
        startActivity(Intent(this@FirstActivity, MainActivity::class.java))
    }

    @Event(type = View.OnClickListener::class, value = R.id.btn_option)
    fun gotooption(v: View) {
        startActivity(Intent(this@FirstActivity, OptionsActivity::class.java))
    }

    @Event(type = View.OnClickListener::class, value = R.id.btn_swipe)
    private  fun gotoswipeClick(v: View) {
        startActivity(Intent(this@FirstActivity, SwipeActivity::class.java))
    }
}
