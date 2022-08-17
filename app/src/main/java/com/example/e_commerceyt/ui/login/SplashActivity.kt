package com.example.e_commerceyt.ui.login

import android.content.Intent
import android.os.Handler
import com.example.e_commerceyt.MainActivity
import com.example.e_commerceyt.R
import com.example.e_commerceyt.databinding.ActivitySplashBinding
import com.example.e_commerceyt.ui.base.BaseActivity

class SplashActivity : BaseActivity<ActivitySplashBinding, SplashViewModel>(
    layoutId = R.layout.activity_splash,
    viewModelClass = SplashViewModel::class.java
) {
    override fun onInitDataBinding() {
        Handler().postDelayed({
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        },2000)
        supportActionBar?.hide()
    }
}