package com.example.lsc_app.utils.uii.splash

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.util.Log
import com.example.lsc_app.MainActivity
import com.example.lsc_app.R
import com.example.lsc_app.base.BaseActivity
import com.example.lsc_app.databinding.ActivitySplashBinding

private const val TAG = "SplashActivity"

class SplashActivity : BaseActivity<ActivitySplashBinding>(ActivitySplashBinding::inflate) {


    override fun handleEvent() {
    }

    override fun bindData() {
        Handler().postDelayed({
            startActivity(Intent(this ,MainActivity::class.java ))
            Log.e(TAG, "onCreate: ", )
            finish()
        },3000
        )
    }

    override fun initData() {
    }
}