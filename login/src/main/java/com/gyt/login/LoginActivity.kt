package com.gyt.login

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.gyt.inject.InjectManger
import com.gyt.inject.LogService
import com.gyt.inject.LoginService
import kotlinx.android.synthetic.main.activity_login.*

/**
 * @author gyt
 * @date on 2020-09-21 11:21
 * @describer
 */
class LoginActivity : AppCompatActivity() {

    private val logger = InjectManger.getInstance().getServiceImpl(LogService::class)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        logger.logI("LoginActivity", "log from LoginActivity")
        var loginSucc = true
        val loginServiceImpl: LoginService =
            InjectManger.getInstance().getServiceImpl(LoginService::class)
        val successFuc = loginServiceImpl.onSuccess
        val errorFuc = loginServiceImpl.onError

        btn_login.setOnClickListener {

            loginSucc = !loginSucc
            if (loginSucc) {
                successFuc?.invoke("gyt", "123456")
            } else {
                errorFuc?.invoke(Throwable("login error!"))
            }
        }
    }
}