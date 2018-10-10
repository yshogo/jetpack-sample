package com.example.yamadashougo.schejule_app.ui.info

import android.arch.lifecycle.ViewModel
import android.databinding.ObservableArrayList
import com.example.yamadashougo.schejule_app.ui.schedule.Schedule
import kotlinx.coroutines.experimental.launch

class InfoViewModel : ViewModel() {

    var items: ObservableArrayList<Schedule> = ObservableArrayList()

    fun start() {
        val service = InfoRepository().getInfo()
        launch {
            val request = service.getInfo()
            val response = request.await()
            if (response.isSuccessful) {
                print(response.body())
            } else {
                // エラー
                print(response)
            }
        }
    }
}
