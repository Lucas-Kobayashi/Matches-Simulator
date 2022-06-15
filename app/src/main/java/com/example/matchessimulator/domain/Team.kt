//Classe em kotlin, muito mais simples, só colocar data na frente que o próprio android studio "seta" os getters e setters

package com.example.matchessimulator.domain

data class Team(
    val name: String,
    val stars: Int,
    val image: String
    )