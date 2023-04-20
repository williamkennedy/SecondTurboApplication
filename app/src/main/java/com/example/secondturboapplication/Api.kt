package com.example.secondturboapplication

import dev.hotwire.turbo.BuildConfig

class Api {
    companion object {
        private val baseUrl = if (com.example.secondturboapplication.BuildConfig.DEBUG)
            "http://10.0.2.2:3003"
        else
            ""

        val rootUrl = "$baseUrl/"
    }

}