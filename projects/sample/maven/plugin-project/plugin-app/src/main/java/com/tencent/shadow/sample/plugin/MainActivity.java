package com.tencent.shadow.sample.plugin;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.tencent.mmkv.MMKV;

@Route(path = "/plugin/main")
public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MMKV kv = MMKV.defaultMMKV();
        Integer value = kv.getInt("test", -2);
        Toast.makeText(this, "这是插件" + " cache " + value, Toast.LENGTH_LONG).show();

        findViewById(R.id.textView).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ARouter.getInstance().build("/plugin/food").navigation();
            }
        });
    }
}