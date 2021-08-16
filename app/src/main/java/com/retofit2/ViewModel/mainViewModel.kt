package com.retofit2.ViewModel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.retofit2.model.Post
import com.retofit2.repository.Repository
import kotlinx.coroutines.launch
import retrofit2.Response

class mainViewModel(private  val repository: Repository):ViewModel() {
    //without response
    //val myResponse: MutableLiveData<Post> = MutableLiveData()
    //with response
    val myResponse: MutableLiveData<Post> = MutableLiveData()
    fun getPost(){

        viewModelScope.launch {
            var response:Post = repository.getPost()
            myResponse.value = response
        }
    }
}