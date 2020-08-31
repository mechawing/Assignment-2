package com.example.assignment_2.ClassicRequest

import com.example.assignment_2.ClassicResponse.ExchangeClassicResponse
import retrofit2.Call
import retrofit2.http.GET

interface ClassicRequestApi {

    @GET("artistName")
    fun getAllPosts(): Call<ExchangeClassicResponse>

}