package com.example.yamadashougo.schejule_app.ui.info

import android.content.Context
import android.databinding.DataBindingUtil
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import com.example.yamadashougo.schejule_app.R
import com.example.yamadashougo.schejule_app.databinding.InfoItemBinding

class InfoListAdapter(val context: Context, var list: List<Info>, val fragment: InfoFragment): RecyclerView.Adapter<InfoListAdapter.ViewHolder>(){

    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): ViewHolder {
        val itemBinding = DataBindingUtil.inflate<InfoItemBinding>(LayoutInflater.from(p0.context), R.layout.info_item, p0, false)
        return ViewHolder(itemBinding)
    }

    override fun getItemCount(): Int {
        return list.count()
    }

    override fun onBindViewHolder(p0: ViewHolder, p1: Int) {
        p0.mItem.item = list[p1]
    }

    inner class ViewHolder(view: InfoItemBinding) : RecyclerView.ViewHolder(view.root) {
        var mItem: InfoItemBinding = view
    }

    fun updateAdapter(items: List<Info>) {
        list = items
//        if (fragment.mScheduleBinding.swipeRefreshLayout.isRefreshing) {
//            fragment.mScheduleBinding.swipeRefreshLayout.isRefreshing = false
//        }
        notifyDataSetChanged()
    }
}