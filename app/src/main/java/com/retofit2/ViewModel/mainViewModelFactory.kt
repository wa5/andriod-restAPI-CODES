package com.retofit2.ViewModel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.retofit2.repository.Repository

class mainViewModelFactory(
    private var repository: Repository
    ):ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return mainViewModel(repository) as T
    }


}