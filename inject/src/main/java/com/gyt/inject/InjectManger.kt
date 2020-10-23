package com.gyt.inject

import kotlin.reflect.KClass

/**
 * @author gyt
 * @date on 2020-09-21 11:49
 * @describer
 */
class InjectManger private constructor() {
    private val mServiceImplMap = hashMapOf<KClass<*>, Any>()

    companion object {
        @Volatile
        private var mInstance: InjectManger? = null

        fun getInstance(): InjectManger =
            mInstance ?: InjectManger().apply { mInstance = this }

    }

    fun <T : Any> registerServiceImpl(clazz: KClass<T>, serviceImpl: T) {
        mServiceImplMap[clazz] = serviceImpl
    }

    @Suppress("UNCHECKED_CAST")
    fun <T : Any> getServiceImpl(clazz: KClass<T>): T =
        mServiceImplMap[clazz] as? T ?: throw IllegalArgumentException("no register ServiceImpl for ${clazz.simpleName}")
}