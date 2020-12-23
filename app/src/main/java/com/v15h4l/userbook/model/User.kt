package com.v15h4l.userbook.model

import android.os.Parcelable
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.parcelize.Parcelize

@Entity(tableName = "users")
@Parcelize
data class User(
    @PrimaryKey(autoGenerate = true) val id: Int = 0,
    var name: String = "",
    var emailId: String = ""
) : Parcelable