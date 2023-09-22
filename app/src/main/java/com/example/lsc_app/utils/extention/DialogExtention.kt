package com.example.lsc_app.utils.extention

import android.app.Dialog
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.view.Gravity
import android.view.WindowManager


fun Dialog.start(stopFlag: Boolean = false) {
    val marginY = -170
//    val binding = DlCommonLoadingBinding.inflate(layoutInflater)
//    setContentView(binding.root)
    window?.apply {
        setLayout(
            WindowManager.LayoutParams.MATCH_PARENT,
            WindowManager.LayoutParams.WRAP_CONTENT
        )
        setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
        attributes.apply {
            y = marginY
            gravity = Gravity.CENTER
        }
    }
    setCancelable(stopFlag)
    show()
}
