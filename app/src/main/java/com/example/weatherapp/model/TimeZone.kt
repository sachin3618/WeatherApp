package com.example.weatherapp.model

data class TimeZone(
    val Code: String,
    val GmtOffset: Double,
    val IsDaylightSaving: Boolean,
    val Name: String,
    val NextOffsetChange: String
)