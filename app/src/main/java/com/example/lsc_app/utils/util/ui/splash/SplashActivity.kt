package com.example.lsc_app.utils.util.ui.splash

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.example.lsc_app.MainActivity
import com.example.lsc_app.R
import com.example.lsc_app.base.BaseActivity
import com.example.lsc_app.databinding.ActivitySplashBinding

class SplashActivity : BaseActivity<ActivitySplashBinding>(ActivitySplashBinding::inflate) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        Handler().postDelayed({
            startActivity(Intent(this ,MainActivity::class.java ))
            finish()
        },3000
        )

    }

    override fun handleEvent() {
    }

    override fun bindData() {
    }

    override fun initData() {
    }
}