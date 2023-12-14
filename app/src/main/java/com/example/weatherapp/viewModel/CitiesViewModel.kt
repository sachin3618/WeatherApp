package com.example.weatherapp.viewModel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.weatherapp.repository.WeatherRepository
import dagger.hilt.android.HiltAndroidApp
import dagger.hilt.android.lifecycle.HiltViewModel
import androidx.lifecycle.switchMap
import androidx.lifecycle.viewModelScope
import com.example.weatherapp.model.Cities
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class CitiesViewModel @Inject constructor(private val repository: WeatherRepository): ViewModel() {


    val citiesList = MutableLiveData<Cities>()


    /*val citiesList = _searchQuery.switchMap {
       repository.getCities(it)
    }*/

   fun searchCities(query : String){
       viewModelScope.launch {
           query.let { citiesList.postValue(repository.getCities(it)) }
       }
   }





}