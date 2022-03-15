package com.codingwithmitch.coroutineexamples.data.model

import kotlin.collections.List

data class Forecast(
    val city: City,
    val cnt: Int,
    val cod: String,
    val list: List<list>,
    val message: Int
)