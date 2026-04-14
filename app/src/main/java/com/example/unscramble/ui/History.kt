package com.example.unscramble.ui

import androidx.room.ColumnInfo
import androidx.room.Entity

@Entity("histories")

data class History(
    @ColumnInfo("Answer")
    val cover: String? = null,
)
