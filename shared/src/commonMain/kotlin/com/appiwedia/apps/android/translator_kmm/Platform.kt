package com.appiwedia.apps.android.translator_kmm

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform