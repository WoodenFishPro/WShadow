package com.tencent.shadow.sample.plugin

import android.app.Activity
import android.os.Bundle
import com.alibaba.android.arouter.facade.annotation.Route

@Route(path = "/plugin/food")
class FoodActivity :Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_food)
    }
}