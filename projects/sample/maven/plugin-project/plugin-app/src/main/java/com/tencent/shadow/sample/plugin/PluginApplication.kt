package com.tencent.shadow.sample.plugin

import android.app.Application
import android.util.Log
import com.alibaba.android.arouter.launcher.ARouter

class PluginApplication:Application() {
    override fun onCreate() {
        Log.d("zhang", "这是插件的Application")
        super.onCreate()
        ARouter.openLog()
        ARouter.openDebug()
        ARouter.debuggable()
        ARouter.init(this)
    }
}