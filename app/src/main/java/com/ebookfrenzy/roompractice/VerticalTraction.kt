package com.ebookfrenzy.roompractice

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.*

@Entity(tableName = "VerticalTraction_table")
data class VerticalTraction(

    @PrimaryKey(autoGenerate = true)
    var VerticalTractionDate: Long = 0L,

    @ColumnInfo(name = "VerticalTraction_weight")
    var VerticalTractionWeight: Int = 0,

    @ColumnInfo(name = "VerticalTraction_reps")
    var VerticalTractionReps: String = ""
)
