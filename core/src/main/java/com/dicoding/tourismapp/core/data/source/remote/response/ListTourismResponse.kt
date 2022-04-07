package com.dicoding.tourismapp.core.data.source.remote.response


import com.google.gson.annotations.SerializedName

data class ListTourismResponse(
    @SerializedName("count")
    val count: Int,
    @SerializedName("error")
    val error: Boolean,
    @SerializedName("message")
    val message: String,
    @SerializedName("places")
    val places: List<TourismResponse>
)