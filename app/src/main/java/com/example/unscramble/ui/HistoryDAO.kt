package com.example.unscramble.ui

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao
interface HistoryDAO {
    @Query("Select * from histories")
    suspend fun getAllBooks():List<History>

    @Insert
    suspend fun insert(vararg histories: History)
}