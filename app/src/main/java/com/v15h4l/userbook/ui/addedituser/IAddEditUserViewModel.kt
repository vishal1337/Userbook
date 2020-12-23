package com.v15h4l.userbook.ui.addedituser

import com.v15h4l.userbook.model.User

interface IAddEditUserViewModel {

    /**
     * Add User to the Database
     */
    fun addUser(user: User)

    /**
     * Update an existing user in the Database
     */
    fun updateUser(user: User)

}