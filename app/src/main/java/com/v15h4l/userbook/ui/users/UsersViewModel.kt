package com.v15h4l.userbook.ui.users

import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.v15h4l.userbook.data.repository.UsersRepository
import com.v15h4l.userbook.model.User
import kotlinx.coroutines.launch

class UsersViewModel @ViewModelInject constructor(private val usersRepository: UsersRepository) :
    ViewModel(), IUserViewModel {

    override fun getUsers(): LiveData<List<User>> = usersRepository.getUsers()

    override fun deleteUser(user: User) {
        viewModelScope.launch {
            usersRepository.deleteUser(user)
        }
    }

}