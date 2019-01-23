package com.example.my.roomlivedatatutorial

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = arrayOf(User::class), version=1, exportSchema = false)
abstract class AppDatabase : RoomDatabase() {
    abstract fun getUserDao() : UserDao

    companion object {
        @Volatile
        private var INSTANCE: AppDatabase? = null

        fun getDatabase(context: Context): AppDatabase{
            return INSTANCE ?: synchronized(this){
                val instance = Room.databaseBuilder(context.applicationContext, AppDatabase::class.java, "db-tutorial").allowMainThreadQueries().build()
                INSTANCE = instance
                return instance
            }
        }
    }
}

