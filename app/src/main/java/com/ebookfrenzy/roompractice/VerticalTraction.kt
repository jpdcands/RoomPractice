package com.ebookfrenzy.roompractice

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "VerticalTraction_table")
data class VerticalTraction(

    @PrimaryKey(autoGenerate = true)
    var VerticalTractionDate: Long = 0L,

    @ColumnInfo(name = "VerticalTraction_table")
    var VerticalTractionWeight: Int = 0,

    @ColumnInfo(name = "VerticalTraction_table")
    var VerticalTractionReps: String = ""
)
