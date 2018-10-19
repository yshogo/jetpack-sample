package com.example.yamadashougo.schejule_app.ui.map.detail

import com.example.yamadashougo.schejule_app.ui.map.MapFragment
import dagger.Component

@Component(modules = [MapDetail::class])
interface MapComponent {

    fun inject(mapFragment: MapFragment)

}