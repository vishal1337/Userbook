package com.v15h4l.userbook.data.room

import androidx.room.Database
import androidx.room.RoomDatabase
import com.v15h4l.userbook.model.User


@Database(entities = [User::class], version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun usersDao(): UsersDao
}