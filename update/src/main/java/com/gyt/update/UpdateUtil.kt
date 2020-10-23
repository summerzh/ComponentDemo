package com.gyt.update

import com.gyt.inject.InjectManger
import com.gyt.inject.LogService
import com.gyt.inject.LoginService

/**
 * @author gyt
 * @date on 2020-09-22 09:11
 * @describer
 */
object UpdateUtil {
    private val mLoginService = InjectManger.getInstance().getServiceImpl(LoginService::class)
    private val mLogger = InjectManger.getInstance().getServiceImpl(LogService::class)

    fun initUpdate() {
        mLogger.logI("UpdateUtil", "initUpdate")
        mLoginService.login({ name, password ->
            mLogger.logI("UpdateUtil", "login success, name = $name, password = $password")
        }, {
            mLogger.logI("UpdateUtil", "login failed, error = $it")
        })
    }
}