package com.example.yamadashougo.schejule_app.ui.map

import android.arch.lifecycle.LiveData
import android.arch.lifecycle.MutableLiveData
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory

class MapRepository {

    fun getMapList(): LiveData<List<Map>> {
        val retrofit = Retrofit.Builder()
                .baseUrl(MapService.baseUrl)
                .addConverterFactory(MoshiConverterFactory.create())
                .build()
        val service = retrofit.create(MapService::class.java)

        val mapList = MutableLiveData<List<Map>>()

        service.getMap().enqueue(object : Callback<List<Map>> {
            override fun onFailure(call: Call<List<Map>>, t: Throwable) {
                print(t)
            }

            override fun onResponse(call: Call<List<Map>>, response: Response<List<Map>>) {
                mapList.value = response.body()
            }
        })

        return mapList
    }
}