package com.example.yamadashougo.schejule_app.ui.schedule

import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory

class ScheduleRepository {

    fun getScheduleList(callback: SchejuleCallback) {
        val retrofit = Retrofit.Builder()
                .baseUrl(ScheduleService.baseUrl)
                .addConverterFactory(MoshiConverterFactory.create())
                .build()
        val service = retrofit.create(ScheduleService::class.java)

        service.getSchedule().enqueue(object : Callback<List<Schedule>> {
            override fun onFailure(call: Call<List<Schedule>>, t: Throwable) {
                callback.onError()
            }

            override fun onResponse(call: Call<List<Schedule>>, response: Response<List<Schedule>>) {

                val list = response.body()
                if (list == null) {
                    callback.onError()
                    return
                }

                callback.onSuccess(list)
            }
        })
    }
}

