package com.example.laboratorio11.network.dto.register

import com.google.gson.annotations.SerializedName


data class RegisterResponse(
    @SerializedName("name") val name : String,
    @SerializedName("email") val email : String,
    @SerializedName("password") val password :String
)