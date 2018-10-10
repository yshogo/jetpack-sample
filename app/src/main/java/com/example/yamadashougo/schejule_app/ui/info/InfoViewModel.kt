package com.example.yamadashougo.schejule_app.ui.info

import android.arch.lifecycle.ViewModel
import android.databinding.ObservableArrayList
import kotlinx.coroutines.experimental.launch

class InfoViewModel : ViewModel() {

    var items: ObservableArrayList<Info> = ObservableArrayList()

    fun start() {
        val service = InfoRepository().getInfo()
        launch {
            val request = service.getInfo()
            val response = request.await()
            if (response.isSuccessful) {
                print(response.body())
                val list = response.body() ?: return@launch
                items.clear()
                items.addAll(list)
            } else {
                // エラー
                print(response.errorBody())
            }
        }
    }
}
