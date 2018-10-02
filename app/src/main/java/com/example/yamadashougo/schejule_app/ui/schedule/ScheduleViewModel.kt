package com.example.yamadashougo.schejule_app.ui.schedule

import android.arch.lifecycle.ViewModel

class ScheduleViewModel : ViewModel() {

    fun start() {
        ScheduleRepository().getScheduleList(object : SchejuleCallback {
            override fun onSuccess(schedulesList: List<Schedule>) {
                print(schedulesList)
            }

            override fun onError() {
            }
        })
    }
}
