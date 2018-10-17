package com.example.yamadashougo.schejule_app.ui.map

import android.arch.lifecycle.ViewModel

class MapViewModel : ViewModel(), MapItemClickListener{

    val items = MapRepository().getMapList()

    override fun itemClick(itemId: Int) {
        print(itemId)
    }
}

interface MapItemClickListener {

    fun itemClick(itemId: Int)
}
