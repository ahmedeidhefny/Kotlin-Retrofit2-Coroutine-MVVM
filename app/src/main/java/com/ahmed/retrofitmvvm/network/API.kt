package com.ahmed.retrofitmvvm.network

import com.ahmed.retrofitmvvm.model.PicsResponse
import com.ahmed.retrofitmvvm.model.loginResponse.LoginResponse
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST

interface API {

    @GET("v2/list")
    suspend fun getPictures(): Response<PicsResponse>

    @POST("api/login")
    suspend fun loginUser(@Body body:RequestBodies.LoginBody): Response<LoginResponse>
}