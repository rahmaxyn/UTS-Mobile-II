package com.example.unscramble.ui

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao
interface HistoryDAO {
    @Query("SELECT * FROM histories WHERE isCorrect = 1")
    suspend fun getCorrectWords(): List<History>

    @Insert
    suspend fun insert(vararg history: History)
}