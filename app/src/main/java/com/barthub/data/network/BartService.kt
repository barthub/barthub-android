package com.barthub.data.network

import com.barthub.data.network.model.bart.rte.RealTimeEstimate
import io.reactivex.Observable
import retrofit2.http.GET
import retrofit2.http.Query

/**
 * Created by Kevin Cho on 5/17/18.
 */
interface BartService {
    @GET("/api/etd.aspx?cmd=etd&json=y")
    fun requestRealTimeEstimates(@Query("orig") orig : String, @Query("key") key : String) : Observable<RealTimeEstimate>
}