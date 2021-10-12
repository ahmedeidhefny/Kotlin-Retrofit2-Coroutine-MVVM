package com.ahmed.retrofitmvvm.repository

import com.ahmed.retrofitmvvm.network.RequestBodies
import com.ahmed.retrofitmvvm.network.RetrofitInstance

class AppRepository {

    suspend fun getPictures() = RetrofitInstance.picsumApi.getPictures()

    suspend fun loginUser(body: RequestBodies.LoginBody) = RetrofitInstance.loginApi.loginUser(body)
}