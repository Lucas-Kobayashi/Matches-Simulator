//Classe em kotlin, muito mais simples, só colocar data na frente que o próprio android studio "seta" os getters e setters

package com.example.matchessimulator.domain

import com.google.gson.annotations.SerializedName

data class Team(
    @SerializedName("nome")
    val name: String,
    @SerializedName("forca")
    val stars: Int,
    @SerializedName("imagem")
    val image: String,
    var score: Int?
    )