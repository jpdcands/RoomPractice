package com.ebookfrenzy.roompractice

import androidx.room.*
import kotlinx.coroutines.flow.Flow

@Dao
interface VerticalTractionDao {

    @Insert
    suspend fun insert(VerticalTraction: VerticalTraction)

    @Update
    suspend fun update(VerticalTraction: VerticalTraction)

    @Delete
    suspend fun delete(VerticalTraction: VerticalTraction)

}