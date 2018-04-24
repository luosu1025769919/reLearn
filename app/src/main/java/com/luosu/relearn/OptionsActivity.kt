package com.luosu.relearn

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentTransaction
import android.support.v7.app.AppCompatActivity
import android.widget.FrameLayout
import android.widget.RadioButton
import android.widget.RadioGroup
import com.luosu.fragment.FragmentFour
import com.luosu.fragment.FragmentOne
import com.luosu.fragment.FragmentThree
import com.luosu.fragment.FragmentTwo
import org.xutils.view.annotation.ViewInject
import org.xutils.x

class OptionsActivity : AppCompatActivity() {
    lateinit internal var fragments: MutableList<Fragment>
    lateinit internal var map: MutableMap<Int, Fragment>

    @ViewInject(R.id.frag_content)
    internal lateinit var frag_content: FrameLayout

    @ViewInject(R.id.radg_option)
    internal lateinit var radg_option: RadioGroup
    @ViewInject(R.id.radb0)
    internal lateinit var radb0: RadioButton
    @ViewInject(R.id.radb1)
    internal lateinit var radb1: RadioButton
    @ViewInject(R.id.radb2)
    internal lateinit var radb2: RadioButton
    @ViewInject(R.id.radb3)
    internal lateinit var radb3: RadioButton

    internal lateinit var radb_before: RadioButton

    internal lateinit var fragmanger: FragmentManager;
    internal lateinit var fragtranstion: FragmentTransaction;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_options)
        x.view().inject(this@OptionsActivity)
        fragments = mutableListOf()
        map = mutableMapOf()
        fragments.add(FragmentOne())
        fragments.add(FragmentTwo())
        fragments.add(FragmentThree())
        fragments.add(FragmentFour())

        fragmanger = this@OptionsActivity.supportFragmentManager
        fragtranstion = fragmanger.beginTransaction()
        fragtranstion.add(R.id.frag_content, fragments[0])
        fragtranstion.commit()
        radb_before = radb0
        map.put(0, fragments[0])
        registerListener()
    }

    fun registerListener() {
        radg_option.setOnCheckedChangeListener { group, checkedId ->
            when (checkedId) {
                R.id.radb0 -> {
                    fragtranstion = fragmanger.beginTransaction()
                    if (map[0] == null) {
                        fragtranstion.add(R.id.frag_content, fragments[0])
                        fragtranstion.hide(fragments[radb_before.getTag().toString().toInt()])
                        map.put(0, fragments[0])
                    } else {
                        fragtranstion.show(fragments[0])
                        fragtranstion.hide(fragments[radb_before.getTag().toString().toInt()])
                    }
                    fragtranstion.commit()
                    radb_before = radb0
                }
                R.id.radb1 -> {
                    fragtranstion = fragmanger.beginTransaction()
                    if (map[1] == null) {
                        fragtranstion.add(R.id.frag_content, fragments[1])
                        fragtranstion.hide(fragments[radb_before.getTag().toString().toInt()])
                        map.put(1, fragments[1])
                    } else {
                        fragtranstion.show(fragments[1])
                        fragtranstion.hide(fragments[radb_before.getTag().toString().toInt()])
                    }
                    fragtranstion.commit()
                    radb_before = radb1
                }
                R.id.radb2 -> {
                    fragtranstion = fragmanger.beginTransaction()
                    if (map[2] == null) {
                        fragtranstion.add(R.id.frag_content, fragments[2])
                        fragtranstion.hide(fragments[radb_before.getTag().toString().toInt()])
                        map.put(2, fragments[2])
                    } else {
                        fragtranstion.show(fragments[2])
                        fragtranstion.hide(fragments[radb_before.getTag().toString().toInt()])
                    }
                    fragtranstion.commit()
                    radb_before = radb2
                }
                R.id.radb3 -> {
                    fragtranstion = fragmanger.beginTransaction()
                    if (map[3] == null) {
                        fragtranstion.add(R.id.frag_content, fragments[3])
                        fragtranstion.hide(fragments[radb_before.getTag().toString().toInt()])
                        map.put(3, fragments[3])
                    } else {
                        fragtranstion.show(fragments[3])
                        fragtranstion.hide(fragments[radb_before.getTag().toString().toInt()])
                    }
                    fragtranstion.commit()
                    radb_before = radb3
                }

            }


        }

        radb0.setOnClickListener {
            if (radb0.isChecked) {
                //选中状态下点击,刷新界面
            }

        }


    }


}
