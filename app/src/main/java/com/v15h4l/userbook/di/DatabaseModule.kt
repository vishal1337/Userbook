package com.v15h4l.userbook.di

import android.content.Context
import androidx.room.Room
import com.v15h4l.userbook.data.room.AppDatabase
import com.v15h4l.userbook.data.room.UsersDao
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent
import dagger.hilt.android.qualifiers.ApplicationContext
import javax.inject.Singleton

@InstallIn(ApplicationComponent::class)
@Module
class DatabaseModule {

    @Provides
    fun provideClothDao(appDatabase: AppDatabase): UsersDao = appDatabase.usersDao()

    @Provides
    @Singleton
    fun provideAppDatabase(@ApplicationContext appContext: Context): AppDatabase =
        Room.databaseBuilder(
            appContext,
            AppDatabase::class.java,
            DATABASE_NAME
        ).build()

    companion object {
        const val DATABASE_NAME = "users-db"
    }

}