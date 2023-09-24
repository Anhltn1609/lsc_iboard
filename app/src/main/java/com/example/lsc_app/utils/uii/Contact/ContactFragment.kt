package com.example.lsc_app.utils.uii.Contact

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.lsc_app.R
import com.example.lsc_app.base.BaseFragment
import com.example.lsc_app.databinding.FragmentContactBinding
import org.koin.androidx.viewmodel.ext.android.viewModel

class ContactFragment : BaseFragment<FragmentContactBinding>(FragmentContactBinding::inflate) {
    override val viewModel by viewModel<ContactViewModel>()

//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//    }
//
//    override fun onCreateView(
//        inflater: LayoutInflater, container: ViewGroup?,
//        savedInstanceState: Bundle?
//    ): View? {
//        // Inflate the layout for this fragment
//        return inflater.inflate(R.layout.fragment_contact, container, false)
//    }

    override fun initData() {
    }

    override fun initEvent() {
    }

    override fun initView() {
    }
}