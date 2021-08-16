package com.retofit2.Api

import com.retofit2.model.Post
import retrofit2.Response
import retrofit2.http.GET

interface SimpleApi {
    @GET("posts/1")
    //this is getting dtat without response
    //so if api is not working will give 404 error
    //suspend fun getPost():Post
    //its going to handle 404 error
    suspend fun getPost():Post
}