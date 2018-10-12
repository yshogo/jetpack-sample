package com.example.yamadashougo.schejule_app.ui.map

import android.arch.lifecycle.ViewModel

class MapViewModel : ViewModel() {

    val items = MapRepository().getMapList()
}
