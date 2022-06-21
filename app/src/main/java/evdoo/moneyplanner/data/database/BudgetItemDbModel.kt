package evdoo.moneyplanner.data.database

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "budget_items")
data class BudgetItemDbModel(
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val title: String,
    val all: Double,
    val spent: Double)
