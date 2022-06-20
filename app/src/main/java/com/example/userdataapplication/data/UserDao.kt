package com.example.userdataapplication.data

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao
interface UserDao {
    @Insert
    fun addUser(userTable: User?)

    @Query("SELECT EXISTS (SELECT * FROM user_table where userName=:userName)")
    fun is_taken(userName: String?): Boolean

    @Query("SELECT EXISTS(SELECT * from user_table where userName=:userName AND password=:password)")
    fun login(userName: String?, password: String?): Boolean

    @Query("SELECT * from user_table")
    abstract fun readAllData(): LiveData<List<User>>

}