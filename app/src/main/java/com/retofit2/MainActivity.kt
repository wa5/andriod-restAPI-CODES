package com.retofit2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.retofit2.ViewModel.mainViewModel
import com.retofit2.ViewModel.mainViewModelFactory
import com.retofit2.repository.Repository

class MainActivity : AppCompatActivity() {
    private  lateinit var viewModel: mainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var repository= Repository()
        var viewModelFactory=mainViewModelFactory(repository)

        viewModel=ViewModelProvider(this,viewModelFactory).get(mainViewModel::class.java)
        viewModel.getPost()
        viewModel.myResponse.observe(this, Observer { reponse ->
            Log.d("Response123",reponse.userId.toString())
            Log.d("Response",reponse.id.toString())
            Log.d("Response9",reponse.title)
            Log.d("Response",reponse.body)
            Log.d("Response", reponse.toString())
        })
    }
}