package com.example.yamadashougo.schejule_app.ui.map

import android.arch.lifecycle.LiveData
import android.arch.lifecycle.MediatorLiveData
import android.arch.lifecycle.ViewModel

class MapViewModel : ViewModel(), MapItemClickListener{

    private val _navigationToDetail = MediatorLiveData<Int>()
    val navigationToDetail: LiveData<Int>
        get() = _navigationToDetail

    val items = MapRepository().getMapList()

    override fun itemClick(itemId: Int) {
        _navigationToDetail.value = itemId
    }
}

interface MapItemClickListener {

    fun itemClick(itemId: Int)
}
