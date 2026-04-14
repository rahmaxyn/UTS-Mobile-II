package com.example.unscramble.ui

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "histories")
data class History(
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    val currentWord: String,
    val isCorrect: Boolean = true
)