package com.v15h4l.userbook.data.repository

import com.v15h4l.userbook.data.room.UsersDao
import com.v15h4l.userbook.model.User
import javax.inject.Inject

class UsersRepository @Inject constructor(private val usersDao: UsersDao) {

    /**
     * Fetch User by id
     */
    fun getUser(id: Int) = usersDao.getUser(id)

    /**
     * Fetch all the Users
     */
    fun getUsers() = usersDao.getUsers()

    /**
     * Add a new User
     */
    suspend fun addUser(user: User) {
        usersDao.insertUser(user)
    }

    /**
     * Update an existing User
     */
    suspend fun updateUser(user: User) {
        usersDao.update(user)
    }

    /**
     * Delete a User
     */
    suspend fun deleteUser(user: User) {
        usersDao.delete(user)
    }

}