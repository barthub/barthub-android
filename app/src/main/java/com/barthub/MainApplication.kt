package com.barthub

import android.app.Application
import com.barthub.data.network.APIClient

/**
 * Created by Kevin Cho on 5/17/18.
 */
class MainApplication : Application() {
    init {
        instance = this
    }

    companion object {
        private var instance: MainApplication? = null
    }

    override fun onCreate() {
        super.onCreate()

        APIClient.create()
    }
}