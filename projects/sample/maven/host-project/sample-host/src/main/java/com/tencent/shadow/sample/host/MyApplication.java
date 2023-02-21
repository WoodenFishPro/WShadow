package com.tencent.shadow.sample.host;

import android.app.Application;
import android.util.Log;

import com.alibaba.android.arouter.launcher.ARouter;
import com.tencent.mmkv.MMKV;
import com.tencent.shadow.sample.introduce_shadow_lib.InitApplication;

public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        InitApplication.onApplicationCreate(this);
        MMKV.initialize(this);

        // 这两行必须写在init之前，否则这些配置在init过程中将无效
        ARouter.openLog(); // 开启日志
        ARouter.openDebug(); // 使用InstantRun的时候，需要打开该开关，上线之后关闭，否则有安全风险
        ARouter.printStackTrace(); // 打印日志的时候打印线程堆栈
        ARouter.init(this); // 尽可能早，推荐在Application中初始化
    }
}
