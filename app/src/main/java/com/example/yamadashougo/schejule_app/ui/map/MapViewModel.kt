package com.example.yamadashougo.schejule_app.ui.map

import android.arch.lifecycle.ViewModel
import android.databinding.ObservableArrayList

class MapViewModel : ViewModel() {

    var items: ObservableArrayList<Map> = ObservableArrayList()

    fun start() {
        // TODO ここでAPIを叩く
    }
}
