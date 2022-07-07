package com.ebookfrenzy.roompractice

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

// Annotates class to be a Room Database with a table (entity) of the Word class

@Database(entities = [VerticalTraction::class], version = 1, exportSchema = false)
abstact class VerticalTractionRoomDatabase : RoomDatabase() {
    abstract val verticalTractionDao: VerticalTractionDao

    companion object {
        // Singleton prevents multiple instances of database opening at the same time.
        @Volatile
        private var INSTANCE: VerticalTractionRoomDatabase? = null

        fun getInstance(context: Context): VerticalTractionRoomDatabase {
        // if the INSTANCE is not null, then return it, if it is, then create the database
            synchronized(this) {
                var instance = INSTANCE
                if (instance == null) {
                    instance = Room.databaseBuilder(
                        context.applicationContext,
                        VerticalTractionRoomDatabase::class.java,
                        "verticalTraction_database"
                    ).build()
                    INSTANCE = instance
                }
                // return instance
                instance
            }
        }
    }
}
