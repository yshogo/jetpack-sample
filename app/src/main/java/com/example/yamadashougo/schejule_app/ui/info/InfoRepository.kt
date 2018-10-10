package com.example.yamadashougo.schejule_app.ui.info

import com.jakewharton.retrofit2.adapter.kotlin.coroutines.experimental.CoroutineCallAdapterFactory
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory

class InfoRepository {

    fun getInfo() = Retrofit.Builder().baseUrl(InfoService.baseUrl)
            .addConverterFactory(MoshiConverterFactory.create())
            .addCallAdapterFactory(CoroutineCallAdapterFactory())
            .build().create(InfoService::class.java)

}