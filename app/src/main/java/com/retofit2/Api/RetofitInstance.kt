package com.retofit2.Api

import com.retofit2.Utils.Constants.Companion.BASE_URL
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetofitInstance {
   private val retrofit  by lazy {
       Retrofit.Builder()
           .baseUrl(BASE_URL)
           .addConverterFactory(GsonConverterFactory.create())
           .build()
   }
    val api:SimpleApi by lazy {
        retrofit.create(SimpleApi::class.java)
    }
}