package com.example.my.roomlivedatatutorial

import androidx.annotation.WorkerThread
import androidx.lifecycle.LiveData

class UserRepository(private val userDao: UserDao) {

    val allUsers: LiveData<List<User>> = userDao.getAllUsersLiveData()

}