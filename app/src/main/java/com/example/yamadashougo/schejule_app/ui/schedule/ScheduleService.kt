package com.example.yamadashougo.schejule_app.ui.schedule

import retrofit2.Call
import retrofit2.http.GET

interface ScheduleService {

    companion object {
        const val baseUrl = "https://firebasestorage.googleapis.com/"
    }

    @GET("v0/b/blog-1a47d.appspot.com/o/json%2FscheduleJson.json?alt=media&token=565f8ef4-c0c6-41b2-bfd5-9b40b881b272")
    fun getSchedule(): Call<List<Schedule>>
}
