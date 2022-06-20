package com.example.userdataapplication

import android.app.Application
import androidx.lifecycle.LiveData
import androidx.room.Room
import com.example.userdataapplication.data.User
import com.example.userdataapplication.data.UserDao
import com.example.userdataapplication.data.UserDatabase

class UserApplication : Application() {

    var database:UserDatabase? = null

    init {
        instance = this
    }

    override fun onCreate() {
        super.onCreate()
           database = Room.databaseBuilder(
            applicationContext,
            UserDatabase::class.java, "user_database"
        ).build()


        val userDao = database!!.userDao()
        val users: LiveData<List<User>> = userDao.readAllData()
    }

    companion object{
        lateinit var instance:UserApplication
        private set
    }
}