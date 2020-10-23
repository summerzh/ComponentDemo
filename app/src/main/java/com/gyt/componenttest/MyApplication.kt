package com.gyt.componenttest

import android.app.Application
import com.gyt.componenttest.inject.injector.Injector
import com.gyt.update.UpdateUtil

/**
 * @author gyt
 * @date on 2020-09-21 11:58
 * @describer
 */
class MyApplication : Application() {
    override fun onCreate() {
        super.onCreate()

        Injector.injectService()
        UpdateUtil.initUpdate()
    }
}