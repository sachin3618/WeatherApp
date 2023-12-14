package com.example.weatherapp.repository

import com.example.weatherapp.Retrofit.CitiesApi
import com.example.weatherapp.model.Cities
import javax.inject.Inject

class WeatherRepository @Inject constructor(val citiesApi: CitiesApi) {


    suspend fun getCities(searchQuery: String): Cities {
        return citiesApi.searchCities("ZIdsk4HWO7r6TbAXlpnHipWhhomGVqcR", searchQuery)
    }

}