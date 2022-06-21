package evdoo.moneyplanner.data.database

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query

@Dao
interface BudgetListDao {

    @Query("SELECT * FROM budget_items")
    fun getBudgetList(): LiveData<List<BudgetItemDbModel>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun addBudgetItem(item: BudgetItemDbModel)

    @Query("DELETE FROM budget_items WHERE id=:id")
    fun deleteBudgetItem(id: Int)

    @Query("SELECT SUM('all') FROM budget_items")
    fun getNeedfullMoney(): Double

    @Query("SELECT SUM('all') - SUM('spent')")
    fun getRemainMoney(): Double
}