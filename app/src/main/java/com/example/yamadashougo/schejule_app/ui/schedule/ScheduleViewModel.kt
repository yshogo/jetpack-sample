package com.example.yamadashougo.schejule_app.ui.schedule

import android.arch.lifecycle.ViewModel
import android.databinding.ObservableArrayList

class ScheduleViewModel : ViewModel() {

    var items: ObservableArrayList<Schedule> = ObservableArrayList()

    fun start() {
        ScheduleRepository().getScheduleList(object : SchejuleCallback {
            override fun onSuccess(schedulesList: List<Schedule>) {
                items.clear()
                items.addAll(schedulesList)
            }

            override fun onError() {
            }
        })
    }
}
