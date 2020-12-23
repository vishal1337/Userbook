package com.v15h4l.userbook.ui.addedituser

import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.v15h4l.userbook.data.repository.UsersRepository
import com.v15h4l.userbook.model.User
import kotlinx.coroutines.launch

class AddEditUserViewModel @ViewModelInject constructor(private val usersRepository: UsersRepository) :
    ViewModel(), IAddEditUserViewModel {

    override fun addUser(user: User) {
        viewModelScope.launch {
            usersRepository.addUser(user)
        }
    }

    override fun updateUser(user: User) {
        viewModelScope.launch {
            usersRepository.updateUser(user)
        }
    }

}