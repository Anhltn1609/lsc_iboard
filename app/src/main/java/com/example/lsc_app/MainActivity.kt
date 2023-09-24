package com.example.lsc_app

import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.util.Log
import androidx.core.view.isVisible
import androidx.navigation.findNavController
import com.example.lsc_app.base.BaseActivity
import androidx.navigation.ui.NavigationUI.setupWithNavController
import com.example.lsc_app.databinding.ActivityMainBinding

private const val TAG = "MainActivity"
class MainActivity : BaseActivity<ActivityMainBinding>(ActivityMainBinding::inflate) {
    private val navController by lazy { findNavController(R.id.nav_host_fragment_activity_main) }
    override fun handleEvent() {

    }

//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
//    }
//    override fun handleEvent() {
//    }

    override fun bindData() {
        setupWithNavController(binding.navView, navController)
        navController.addOnDestinationChangedListener { _, destination, _ ->
            when (destination.id) {
                R.id.homeFragment2 -> setNavigationVisible(true)
                R.id.contactFragment -> setNavigationVisible(true)
                R.id.plusFragment -> setNavigationVisible(true)
                R.id.cartFragment -> setNavigationVisible(true)
                R.id.customerFragment -> setNavigationVisible(true)
                else -> {
                    setNavigationVisible()
                }
            }
        }

    }

    private fun setNavigationVisible(isVisible: Boolean = false) {
        try {
            Handler(Looper.getMainLooper()).postDelayed({
                binding.navView.isVisible = isVisible
            }, 500)
        } catch (e: Exception) {
            Log.e(TAG, "setNavigationVisible: e"+ e.toString(), )
            binding.navView.isVisible = isVisible
        }

    }

    override fun initData() {
    }
}