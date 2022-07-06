package com.ebookfrenzy.roompractice

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

// Annotates class to be a Room Database with a table (entity) of the Word class
@Database(entities = arrayOf(VerticalTraction::class), version = 1, exportSchema = false)
public abstact class VerticalTractionRoomDatabase : RoomDatabase() {

    abstract fun wordDao(): VerticalTractionDao

    companion object {
        // Singleton prevents multiple instances of database opening at the
        // same time.
        @Volatile
        private var INSTANCE: VerticalTractionRoomDatabase? = null

        fun getDatabase(context: Context): VerticalTractionRoomDatabase {
            // if the INSTANCE is not null, then return it,
            // if it is, then create the database
            return INSTANCE ?: synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    VerticalTractionRoomDatabase::class.java,
                    "word_database"
                ).build()
                INSTANCE = instance
                // return instance
                instance
            }
        }
    }
}
}