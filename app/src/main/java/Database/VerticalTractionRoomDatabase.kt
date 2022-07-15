package Database

import androidx.room.*
import com.ebookfrenzy.roompractice.VerticalTraction

// [ ] means an array
@Database(entities = [VerticalTraction::class], version = 1)
@TypeConverters(VerticalTractionTypeConverter::class)
abstract class VerticalTractionRoomDatabase : RoomDatabase() {
        abstract fun verticalTractionDao(): VerticalTractionDao
}
