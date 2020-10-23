package com.gyt.componenttest.inject.serviceimpl

import com.gyt.inject.LoginService

/**
 * @author gyt
 * @date on 2020-09-21 18:30
 * @describer
 */
class LoginServiceImpl : LoginService {
    override var onSuccess: ((name: String, password: String) -> Unit)? = null
    override var onError: ((error: Throwable) -> Unit)? = null

    override fun login(
        onSuccess: (name: String, password: String) -> Unit,
        onError: (error: Throwable) -> Unit
    ) {
        this.onSuccess = onSuccess
        this.onError = onError
    }
}