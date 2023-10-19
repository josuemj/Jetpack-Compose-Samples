package com.example.databases.data

import androidx.room.Entity
import androidx.room.PrimaryKey

/**
 * Represent table within the database
 */
@Entity(tableName = "user_table")
data class User(
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val mail: String,
    val username: String,
    val password: String
)