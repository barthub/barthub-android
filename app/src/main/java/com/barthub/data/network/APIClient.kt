package com.barthub.data.network

import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory

/**
 * Created by Kevin Cho on 5/17/18.
 */
class APIClient {
    private var bartAPI: BartService

    companion object {
        private var instance : APIClient? = null

        fun create() {
            instance = APIClient()
        }

        fun api() : BartService {
            instance ?: APIClient()
            return instance!!.bartAPI
        }
    }

    init {
        var retrofit = Retrofit.Builder()
                .baseUrl("https://api.bart.gov/")
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build()

        bartAPI = retrofit.create(BartService::class.java)
    }
}