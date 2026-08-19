package com.example.myapplication

import kotlinx.serialization.Serializable

@Serializable
data object HomeRoute

@Serializable
data object ProfileRoute

@Serializable
data class DetailRoute(
    val itemId: String,
    val title: String = "Sin Título"
)
