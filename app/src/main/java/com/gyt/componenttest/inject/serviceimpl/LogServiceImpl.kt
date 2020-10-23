package com.gyt.componenttest.inject.serviceimpl

import com.gyt.inject.LogService
import com.gyt.log.Logger

/**
 * @author gyt
 * @date on 2020-09-21 11:25
 * @describer
 */
class LogServiceImpl : LogService {
    override fun logI(tag: String?, msg: String?) {
        Logger.logI(tag, msg)
    }
}