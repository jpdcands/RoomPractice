package com.ebookfrenzy.roompractice

import Database.VerticalTractionDao
import android.content.Context
import androidx.annotation.WorkerThread
import kotlinx.coroutines.flow.Flow

class VerticalTractionRepository private constructor(context: Context) {

    companion object {
        private var INSTANCE: VerticalTractionRepository? = null

        fun initialize(context: Context) {
            if (INSTANCE == null) {
                INSTANCE = VerticalTractionRepository(context)
            }
        }

        fun get(): VerticalTractionRepository {
            return INSTANCE ?: throw  IllegalStateException("CrimeRepositor;y muyst be initialized")
        }
    }
}



