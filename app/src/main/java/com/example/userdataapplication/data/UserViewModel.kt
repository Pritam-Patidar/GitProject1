package com.example.userdataapplication.data

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.userdataapplication.UserApplication
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class UserViewModel(): ViewModel() {
    private val readAllData: LiveData<List<User>>
    private val repository:UserRepository
    init{
        val userDao = UserApplication.instance.database!!.userDao()
        repository = UserRepository(userDao)
        readAllData = repository.readAllData
    }

    fun addUser(user: User){
        viewModelScope.launch(Dispatchers.IO){
            repository.addUser(user)
        }
    }
}
