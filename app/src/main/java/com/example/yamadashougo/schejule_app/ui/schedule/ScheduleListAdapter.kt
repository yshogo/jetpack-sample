package com.example.yamadashougo.schejule_app.ui.schedule

import android.content.Context
import android.databinding.DataBindingUtil
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import com.example.yamadashougo.schejule_app.R
import com.example.yamadashougo.schejule_app.databinding.ScheduleItemBinding

class ScheduleListAdapter(val context: Context, var list: List<Schedule>) : RecyclerView.Adapter<ScheduleListAdapter.ViewHolder>(){

    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): ViewHolder {
        val itemBinding = DataBindingUtil.inflate<ScheduleItemBinding>(LayoutInflater.from(p0.context), R.layout.schedule_item, p0, false)
        return ViewHolder(itemBinding)
    }

    override fun getItemCount(): Int {
        return list.count()
    }

    override fun onBindViewHolder(p0: ViewHolder, p1: Int) {
        p0.mItem.item = list[p1]
    }

    inner class ViewHolder(view: ScheduleItemBinding) : RecyclerView.ViewHolder(view.root) {
        var mItem: ScheduleItemBinding = view
    }

    fun updateAdapter(items: List<Schedule>) {
        list = items
        notifyDataSetChanged()
    }
}