package com.codingwithmitch.coroutineexamples.data.model

import kotlin.collections.List

data class list(
    val clouds: Clouds,
    val dt: Int,
    val dt_txt: String,
    val main: Main,
    val pop: Double,
    val rain: Rain,
    val sys: SysX,
    val visibility: Int,
    val weather: List<Weather>,
    val wind: Wind
)