package com.ahmed.retrofitmvvm.model.loginResponse


import com.google.gson.annotations.SerializedName

data class LoginResponse(
    @SerializedName("token")
    val token: String
)