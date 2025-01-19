package com.example.telegram

data class Chat(
    val imageResId: Int,
    val name: String,
    val message: String,
    val date: String // Aquí agregamos el campo de la fecha
)
