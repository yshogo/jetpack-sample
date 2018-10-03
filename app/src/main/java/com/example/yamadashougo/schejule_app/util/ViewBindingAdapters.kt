package com.example.yamadashougo.schejule_app.util

import android.databinding.BindingAdapter
import android.support.v7.widget.RecyclerView
import com.example.yamadashougo.schejule_app.ui.schedule.Schedule
import com.example.yamadashougo.schejule_app.ui.schedule.ScheduleListAdapter

@BindingAdapter("items")
fun items(recyclerView: RecyclerView, items: List<Schedule>) {

    val adapter = recyclerView.adapter
    if (adapter != null && adapter is ScheduleListAdapter) {
        adapter.notifyDataSetChanged()
    }
}
