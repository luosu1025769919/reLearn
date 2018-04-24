package com.luosu.base

import android.app.Application
import com.luosu.config.ApplicationConfig
import org.xutils.x

/**
 * Created by 落苏 on 2018/4/2.
 */
class BaseApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        x.Ext.init(this)
        x.Ext.setDebug(ApplicationConfig.isDebug)
    }
}