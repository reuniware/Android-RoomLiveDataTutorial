package com.example.my.roomlivedatatutorial

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query

@Dao
interface UserDao {
    @Insert
    fun insertUsers(vararg users:User)

    @Delete
    fun deleteUsers(vararg  users:User)

    @Query("SELECT * from user")
    fun getAllUsers(): List<User>

    @Query("SELECT * from user")
    fun getAllUsersLiveData(): LiveData<List<User>>

    @Query("SELECT * from user where id= :id")
    fun getUser(id: Int): User

    @Query("SELECT * from user where firstName LIKE :search OR lastName LIKE :search")
    fun findUserWithName(search: String) : List<User>

    @Query("DELETE from user")
    fun deleteAllUsers()
}

