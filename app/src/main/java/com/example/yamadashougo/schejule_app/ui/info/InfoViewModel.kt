package com.example.yamadashougo.schejule_app.ui.info

import android.arch.lifecycle.ViewModel
import android.databinding.ObservableArrayList
import com.example.yamadashougo.schejule_app.ui.schedule.Schedule

class InfoViewModel : ViewModel() {

    var items: ObservableArrayList<Schedule> = ObservableArrayList()

    fun start() {
       // TODO ここでAPIを叩く処理を書く
    }
}
