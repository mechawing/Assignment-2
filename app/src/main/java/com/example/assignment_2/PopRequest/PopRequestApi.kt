package com.example.assignment_2.PopRequest

import retrofit2.Call
import retrofit2.http.GET
import com.example.assignment_2.PopResponse.ExchangePopResponse

interface PopRequestApi {

    @GET("artistName")
    fun getAllPosts(): Call<ExchangePopResponse>

}