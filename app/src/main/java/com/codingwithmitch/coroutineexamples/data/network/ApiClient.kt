package com.codingwithmitch.coroutineexamples.data.network

import com.codingwithmitch.coroutineexamples.data.model.Forecast
import com.codingwithmitch.coroutineexamples.data.model.NewInitial
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiClient {

    @GET("weather?")
    suspend fun getCurrentDate(@Query( "q")q: String,@Query( "appid")appid: String ): Response<NewInitial>

    @GET("forecast?")
    suspend fun getDogsBy(@Query( "lat")lat: Double,@Query( "lon")lon: Double,@Query( "appid")appid: String): Response<Forecast>
}
