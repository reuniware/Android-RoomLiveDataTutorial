package com.example.my.roomlivedatatutorial

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class User (
    @PrimaryKey(autoGenerate = true)
    var id: Int,
    var firstName: String?,
    var lastName: String?
)

