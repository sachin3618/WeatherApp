package com.example.weatherapp.Retrofit

import com.example.weatherapp.model.Cities
import retrofit2.http.GET
import retrofit2.http.Query

interface CitiesApi {

    @GET("/locations/v1/cities/search/")
    suspend fun searchCities(
        @Query("apikey") apiKey: String,
        @Query("q") query: String
    ): Cities

}