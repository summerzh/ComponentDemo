package com.gyt.componenttest.inject.injector

import com.gyt.componenttest.inject.serviceimpl.LogServiceImpl
import com.gyt.componenttest.inject.serviceimpl.LoginServiceImpl
import com.gyt.inject.InjectManger
import com.gyt.inject.LogService
import com.gyt.inject.LoginService

/**
 * @author gyt
 * @date on 2020-09-21 11:49
 * @describer
 */
object Injector {

    fun injectService(){
        val injectManger = InjectManger.getInstance()
        injectManger.registerServiceImpl(LogService::class, LogServiceImpl())
        injectManger.registerServiceImpl(LoginService::class,LoginServiceImpl())
    }
}