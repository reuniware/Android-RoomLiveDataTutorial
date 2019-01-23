package com.example.my.roomlivedatatutorial

import androidx.annotation.WorkerThread
import androidx.lifecycle.LiveData

class UserRepository(private val userDao: UserDao) {

    val allUsers: LiveData<List<User>> = userDao.getAllUsersLiveData()

    @WorkerThread // Spécifie que cette méthode doit être appelée depuis un thread non UI
    suspend fun insert(user: User){
        userDao.insertUsers(user)
    }

}