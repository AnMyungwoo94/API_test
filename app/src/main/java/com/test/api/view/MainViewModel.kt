package com.test.api.view


import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.test.api.repository.NetWorkRepository
import kotlinx.coroutines.launch

class MainViewModel : ViewModel() {

    private val netWorkRepository = NetWorkRepository()

    fun getCurrentCoinList() = viewModelScope.launch {

        val result = netWorkRepository.getCurrentCoinList()
        Log.e("코인리스트 가져오기",result.toString())
    }
}