package com.example.yamadashougo.schejule_app.ui.schedule

import android.arch.lifecycle.LiveData
import android.arch.lifecycle.ViewModel
import android.databinding.ObservableField

class ScheduleViewModel : ViewModel() {

    var scheduleObservable: LiveData<List<Schedule>> = ScheduleRepository.getSchejuleList()
    var scheduleObservableField = ObservableField<Schedule>()

    fun getObservableSchedule(): LiveData<List<Schedule>> {
        return scheduleObservable
    }

    fun setSchedule(schedule: Schedule) {
        this.scheduleObservableField.set(schedule)
    }
}
