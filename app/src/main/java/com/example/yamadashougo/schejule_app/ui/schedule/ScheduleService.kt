package com.example.yamadashougo.schejule_app.ui.schedule

import retrofit2.Call
import retrofit2.http.GET

interface ScheduleService {

    companion object {
        const val baseUrl = "https://firebasestorage.googleapis.com/"
    }

    @GET("v0/b/blog-1a47d.appspot.com/o/json%2FscheduleJson.json?alt=media&token=4af7fb1c-79f0-480e-8d78-68ebddc55ef5")
    fun getSchedule(): Call<List<Schedule>>
}
