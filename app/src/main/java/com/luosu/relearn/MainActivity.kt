package com.luosu.relearn

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.github.mikephil.charting.charts.LineChart
import com.github.mikephil.charting.data.Entry
import com.github.mikephil.charting.data.LineData
import com.github.mikephil.charting.data.LineDataSet
import org.xutils.view.annotation.ContentView
import org.xutils.view.annotation.ViewInject
import org.xutils.x

@ContentView(R.layout.activity_main)
class MainActivity : AppCompatActivity() {

    internal lateinit var linedata: MutableList<Entry>
    internal lateinit var linedata1: MutableList<Entry>


    @ViewInject(R.id.linechart)
    internal lateinit var lineChart: LineChart;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        x.view().inject(this)
        initLineChart()

    }


    fun initLineChart() {
        linedata = mutableListOf()
        linedata1 = mutableListOf()

        for (i in 1..10) {
            linedata.add(Entry(i.toFloat(), (Math.random() * 80).toFloat()))
            linedata1.add(Entry(i.toFloat(), (Math.random() * 80).toFloat()))


        }
        var set: LineDataSet = LineDataSet(linedata, "温度")
        var set1: LineDataSet = LineDataSet(linedata1, "温度")

        lineChart.data = LineData(set, set1)


    }
}
