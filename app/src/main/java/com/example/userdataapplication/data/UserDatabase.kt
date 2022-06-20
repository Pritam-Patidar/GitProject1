package com.example.userdataapplication.data

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.sqlite.db.SupportSQLiteDatabase

@Database(entities = [User::class], version = 1)
abstract class UserDatabase : RoomDatabase() {

    abstract fun userDao(): UserDao


//    companion object : RoomDatabase.Callback() {
//
////        fun createOrGetAppDatabase(context: Context): UserDatabase {
////            return get(UserDatabase::class.java)
////        }
//
//        override fun onCreate(db:SupportSQLiteDatabase) {
//            super.onCreate(db)
//            //Log.info("Database created")
//        }
//
//        override fun onOpen(db: SupportSQLiteDatabase) {
//            super.onOpen(db)
//            //Log.info("Database opened")
//        }
//
//        override fun onDestructiveMigration(db: SupportSQLiteDatabase) {
//            super.onDestructiveMigration(db)
//            //Log.info("Database destructively migrated to version $latestVersion")
//        }
//    }

}