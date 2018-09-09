package com.example.yamadashougo.schejule_app.ui.schedule

import android.arch.lifecycle.LiveData
import android.arch.lifecycle.ViewModel

class ScheduleViewModel : ViewModel() {

    lateinit var scheduleObservable: LiveData<List<Schedule>>

    init {
        scheduleObservable = ScheduleRepository.getSchejuleList()
    }

//    fun getObservableSchedule():  {
//        return scheduleObservable
//    }
}
