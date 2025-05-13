package br.senai.sp.jandira.rickandmortyapi.service
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create

class RetrofitFactory {

    private val BASE_URL = "https://rickandmortyapi.com/api/"

    private val retrofitFactory = Retrofit
        .Builder()
        .baseUrl(BASE_URL)
        .addConverterFactory(GsonConverterFactory.create())
        .build()


    fun getCharacterService(): CharacterService{
        return retrofitFactory.create(CharacterService::class.java)
    }
}