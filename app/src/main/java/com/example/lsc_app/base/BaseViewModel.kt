package com.example.lsc_app.base

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.lsc_app.utils.util.SingleLiveEvent
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch
import java.net.CacheRequest

open class BaseViewModel : ViewModel() {
    private val loading = MutableLiveData(false)
    val isLoading : LiveData<Boolean>
        get() = loading
    // SingleLive là một implemetation có tác dụng đảm bảo mỗi sự kiện chỉ được goijduy nhất môt lần
    protected val error = SingleLiveEvent<String>()
    val hasError: LiveData<String>
        get() = error

    protected fun <T> executeTask(
        request: suspend CoroutineScope.() -> DataResult<T>,
        onSuccess: (T) -> Unit,
        onError: (Exception) -> Unit = {},
        showLoading: Boolean = true
    ){
        if(showLoading)showLoading()
        viewModelScope.launch{
            when (val response = request(this)) {
                is DataResult.Success -> {
                    onSuccess(response.data)
                    hideLoading()
                }
                is DataResult.Error -> {
                    onError(response.exception)
                    hideLoading()
                }
            }
        }
    }

    private fun showLoading(){
        loading.value = true
    }
    private fun hideLoading(){
        loading.value = false
    }
}