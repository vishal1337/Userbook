package com.v15h4l.userbook.ui.users

import androidx.lifecycle.LiveData
import com.v15h4l.userbook.model.User

interface IUserViewModel {

    /**
     * Get a LiveData for a list of Users.
     */
    fun getUsers(): LiveData<List<User>>

    /**
     * Delete User
     * @param user to delete
     */
    fun deleteUser(user: User)
}