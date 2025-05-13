package br.senai.sp.jandira.rickandmortyapi.model

data class Character (
    var id: Int = 0,
    var name: String = "",
    var status: String = "",
    var species: String = "",
    var images: String = ""
)