package kr.ac.kumoh.s20171268.s25w08retrofit.api

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object SongApiConfig {
    const val PROJECT_URL = "https://bjskwerjmvkjalgxzfyx.supabase.co"
    const val SERVER_URL = "$PROJECT_URL/rest/v1/"
    const val API_KEY = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJzdXBhYmFzZSIsInJlZiI6ImJqc2t3ZXJqbXZramFsZ3h6Znl4Iiwicm9sZSI6ImFub24iLCJpYXQiOjE3NjQ3MzQ1MzcsImV4cCI6MjA4MDMxMDUzN30.eOIh7Sbw-I43HMlhGy-BrzDO0kIFi2JqHb0jGjo4oVg"

    // Retrofit Singleton Instance
    val retrofit: Retrofit by lazy {
        Retrofit.Builder()
            .baseUrl(SERVER_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    // SongApi 인터페이스 구현체
    val songService: SongApi by lazy {
        retrofit.create(SongApi::class.java)
    }
}