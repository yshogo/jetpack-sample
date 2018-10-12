package com.example.yamadashougo.schejule_app.ui.map

import android.content.Context
import android.databinding.DataBindingUtil
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import com.example.yamadashougo.schejule_app.R
import com.example.yamadashougo.schejule_app.databinding.MapItemBinding

class MapListAdapter(val context: Context, var list: List<Map>, val fragment: MapFragment) : RecyclerView.Adapter<MapListAdapter.ViewHolder>(){

    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): ViewHolder {
        val itemBinding = DataBindingUtil.inflate<MapItemBinding>(LayoutInflater.from(p0.context), R.layout.map_item, p0, false)
        return ViewHolder(itemBinding)
    }

    override fun getItemCount(): Int {
        return list.count()
    }

    override fun onBindViewHolder(p0: ViewHolder, p1: Int) {
        p0.mItem.item = list[p1]
    }

    inner class ViewHolder(view: MapItemBinding) : RecyclerView.ViewHolder(view.root) {
        var mItem: MapItemBinding = view
    }

    fun update(items: List<Map>) {
        list = items
        notifyDataSetChanged()
    }
}