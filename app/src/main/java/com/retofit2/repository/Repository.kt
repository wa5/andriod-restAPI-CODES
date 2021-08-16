package com.retofit2.repository

import com.retofit2.Api.RetofitInstance
import com.retofit2.model.Post
import retrofit2.Response

class Repository {
    //without 404 saport
   // suspend fun  getPost():Post{
    //with 404 saport
    // suspend fun  getPost():Response<Post>{
    suspend fun  getPost():Post{
        return RetofitInstance.api.getPost()
    }
}