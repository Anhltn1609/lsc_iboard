package com.example.lsc_app.di
import com.example.lsc_app.utils.uii.Contact.ContactViewModel
import com.example.lsc_app.utils.uii.Customer.CustomerViewModel
import com.example.lsc_app.utils.uii.cart.CartViewModel
import com.example.lsc_app.utils.uii.home.HomeViewModel
import com.example.lsc_app.utils.uii.plus.PlusViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val viewModelModule = module {
    viewModel{ CartViewModel()}
    viewModel{ HomeViewModel()}
    viewModel{ PlusViewModel()}
    viewModel{ ContactViewModel()}
    viewModel{ CustomerViewModel()}
}