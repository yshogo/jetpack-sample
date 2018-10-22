package com.example.yamadashougo.schejule_app.ui.info

import android.arch.lifecycle.ViewModel
import com.example.yamadashougo.schejule_app.util.ViewModelKey
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
internal abstract class InfoModule {

    @Binds
    @IntoMap
    @ViewModelKey(InfoViewModel::class)
    abstract fun bindInfoViewModel(viewModel: InfoViewModel) : ViewModel
}