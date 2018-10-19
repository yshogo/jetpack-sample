package com.example.yamadashougo.schejule_app.ui.map.detail

import dagger.Module
import dagger.Provides

@Module
class MapDetail {

    @Provides
    fun provideHelloProvide() = MapDetail()

    fun sayHelloDaggarProvide() : String {
        return "Hello Daggar"
    }
}