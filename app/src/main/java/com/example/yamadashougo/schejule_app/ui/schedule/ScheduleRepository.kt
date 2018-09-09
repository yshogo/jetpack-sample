package com.example.yamadashougo.schejule_app.ui.schedule

import android.arch.lifecycle.LiveData
import android.arch.lifecycle.MutableLiveData
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import android.support.annotation.Nullable
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response


private lateinit var service: ScheduleService

object ScheduleRepository {

    init {
        val retrofit = Retrofit.Builder()
                .baseUrl(ScheduleService.baseUrl)
                .addConverterFactory(GsonConverterFactory.create())
                .build()

        service = retrofit.create(ScheduleService::class.java)
    }

    fun getSchejuleList(): LiveData<List<Schedule>> {
        val data = MutableLiveData<List<Schedule>>()

        service.getSchedule().enqueue(object : Callback<List<Schedule>> {

            override fun onResponse(call: Call<List<Schedule>>, @Nullable response: Response<List<Schedule>>) {
                print(response.body())
                data.value = response.body()
            }

            override fun onFailure(call: Call<List<Schedule>>, t: Throwable) {
                data.setValue(null)
            }
        })

        return data
    }
}

