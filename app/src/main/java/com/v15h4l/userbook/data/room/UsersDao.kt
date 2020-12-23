package com.v15h4l.userbook.data.room

import androidx.lifecycle.LiveData
import androidx.room.*
import com.v15h4l.userbook.model.User

/**
 * Data Access Object for Users
 */
@Dao
interface UsersDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertUser(user: User)

    @Query("SELECT * FROM users WHERE id = :id")
    fun getUser(id: Int): User

    @Query("SELECT * FROM users")
    fun getUsers(): LiveData<List<User>>

    @Update
    suspend fun update(user: User)

    @Delete
    suspend fun delete(user: User)

    @Query("DELETE FROM users")
    suspend fun deleteAllUsers()

}