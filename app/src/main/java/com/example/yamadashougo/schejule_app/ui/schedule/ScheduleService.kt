package com.example.yamadashougo.schejule_app.ui.schedule

import retrofit2.Call
import retrofit2.http.GET

interface ScheduleService {

    companion object {
        const val baseUrl = "https://firebasestorage.googleapis.com/"
    }

    @GET("v0/b/blog-1a47d.appspot.com/o/json%2FscheduleJson.json?alt=media&token=0702053a-0b6d-488a-9409-954d25b3ecb2")
    fun getSchedule(): Call<List<Schedule>>
}
