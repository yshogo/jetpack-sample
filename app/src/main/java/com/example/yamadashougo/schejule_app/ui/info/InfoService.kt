package com.example.yamadashougo.schejule_app.ui.info

import kotlinx.coroutines.experimental.Deferred
import retrofit2.Response
import retrofit2.http.GET

interface InfoService {

    companion object {
        const val baseUrl = "https://firebasestorage.googleapis.com/"
    }

    @GET("v0/b/blog-1a47d.appspot.com/o/json%2FscheduleJson.json?alt=media&token=565f8ef4-c0c6-41b2-bfd5-9b40b881b272")
    fun getInfo(): Deferred<Response<List<Info>>>
}
