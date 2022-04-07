package com.dicoding.tourismapp.core.data.source.remote.response

import com.google.gson.annotations.SerializedName

data class TourismResponse(
    @field:SerializedName("address")
    val address: String,
    @field:SerializedName("description")
    val description: String,
    @field:SerializedName("id")
    val id: Int,
    @SerializedName("image")
    val image: String,
    @SerializedName("latitude")
    val latitude: Double,
    @SerializedName("like")
    val like: Int,
    @SerializedName("longitude")
    val longitude: Double,
    @SerializedName("name")
    val name: String
)

