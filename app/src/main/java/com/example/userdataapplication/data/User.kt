package com.example.userdataapplication.data

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "user_table")
data class User(
    @PrimaryKey(autoGenerate = true)
    var id: Int = 0,
    val userName: String,
    val password: String,
    val password1: String

)