package com.example.yamadashougo.schejule_app

import com.example.yamadashougo.schejule_app.ui.info.InfoModule
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivityBindingModule {

    @ActivityScoped
    @ContributesAndroidInjector(
            modules = [
                InfoModule::class
            ]
    )
    internal abstract fun mainActivity(): MainActivity
}