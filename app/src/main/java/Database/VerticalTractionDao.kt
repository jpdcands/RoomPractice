package Database

import androidx.room.*
import com.ebookfrenzy.roompractice.VerticalTraction

@Dao
interface VerticalTractionDao {

    @Insert
    suspend fun insert(verticalTraction: VerticalTraction)
    @Update
    suspend fun update(verticalTraction: VerticalTraction)
    @Delete
    suspend fun delete(verticalTraction: VerticalTraction)
}