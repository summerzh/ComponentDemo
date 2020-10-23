package com.gyt.log

import android.util.Log

/**
 * @author gyt
 * @date on 2020-09-21 11:22
 * @describer
 */
object Logger {

    fun logI(tag: String?, msg: String?){
        Log.i(tag, msg)
    }
}