package com.example.yamadashougo.schejule_app.ui.schedule

interface SchejuleCallback {
    fun onSuccess(schedulesList: List<Schedule>)

    fun onError()
}