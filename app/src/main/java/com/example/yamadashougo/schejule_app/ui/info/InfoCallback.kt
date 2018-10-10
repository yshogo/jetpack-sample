package com.example.yamadashougo.schejule_app.ui.info

sealed class InfoCallback<out T : Any> {
    class Success<out T : Any>(val data: T)

    class Error()
}