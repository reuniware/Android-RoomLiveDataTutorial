package com.example.my.roomlivedatatutorial

import android.app.Application
import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel

class UserViewModel (application: Application): ViewModel() {

    private val repository: UserRepository
    private val allUsers: LiveData<List<User>>

    init{
        val userDao = AppDatabase.getDatabase(application).getUserDao()
        repository = UserRepository(userDao)
        allUsers = repository.allUsers
    }

    fun getAllUsers() : LiveData<List<User>>{
        return allUsers
    }



}