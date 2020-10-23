package com.gyt.inject

/**
 * @author gyt
 * @date on 2020-09-21 18:29
 * @describer
 */
interface LoginService {
    var onSuccess: ((name: String, password: String) -> Unit)?
    var onError: ((error: Throwable) -> Unit)?

    fun login(
        onSuccess: (name: String, password: String) -> Unit,
        onError: (error: Throwable) -> Unit
    )
}