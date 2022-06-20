package evdoo.moneyplanner.domain

data class BudgetItem(
    val title: String,
    val all: Double,
    val spent: Double,
    var id: Int = -1
)