package com.example.yamadashougo.schejule_app.util

import android.databinding.BindingAdapter
import android.support.v7.widget.RecyclerView
import com.example.yamadashougo.schejule_app.ui.info.Info
import com.example.yamadashougo.schejule_app.ui.info.InfoListAdapter
import com.example.yamadashougo.schejule_app.ui.map.Map
import com.example.yamadashougo.schejule_app.ui.map.MapListAdapter
import com.example.yamadashougo.schejule_app.ui.schedule.Schedule
import com.example.yamadashougo.schejule_app.ui.schedule.ScheduleListAdapter

@BindingAdapter("items")
fun items(recyclerView: RecyclerView, items: List<Schedule>) {

    val adapter = recyclerView.adapter
    if (adapter != null && adapter is ScheduleListAdapter) {
        adapter.updateAdapter(items)
    }
}

@BindingAdapter("items")
fun infoItems(recyclerView: RecyclerView, items: List<Info>) {

    val adapter = recyclerView.adapter
    if (adapter != null && adapter is InfoListAdapter) {
        adapter.updateAdapter(items)
    }
}

@BindingAdapter("items")
fun mapItems(recyclerView: RecyclerView, items: List<Map>?) {

    val adapter = recyclerView.adapter ?: return
    items ?: return

    if (adapter is MapListAdapter) {
        adapter.update(items)
    }
}