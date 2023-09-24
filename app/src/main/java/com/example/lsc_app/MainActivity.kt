package com.example.lsc_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.lsc_app.base.BaseActivity
import com.example.lsc_app.databinding.ActivityMainBinding

class MainActivity : BaseActivity<ActivityMainBinding>(ActivityMainBinding::inflate ) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun handleEvent() {
    }

    override fun bindData() {
    }

    override fun initData() {
    }
}