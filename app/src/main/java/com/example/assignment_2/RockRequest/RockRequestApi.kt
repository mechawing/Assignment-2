package com.example.assignment_2.RockRequest

import com.example.assignment_2.RockResponse.ExchangeRockResponse
import retrofit2.Call
import retrofit2.http.GET

interface RockRequestApi {

    @GET("artistName")
    fun getAllPosts(): Call<ExchangeRockResponse>

}