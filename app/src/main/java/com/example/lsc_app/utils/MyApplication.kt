package com.example.lsc_app.utils

import android.app.Application
import com.example.lsc_app.di.networkModule
import com.example.lsc_app.di.viewModelModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class MyApplication: Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@MyApplication)
            modules(
                viewModelModule,networkModule
            )
        }
    }
}