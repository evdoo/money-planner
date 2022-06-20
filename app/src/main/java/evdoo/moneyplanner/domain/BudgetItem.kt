package evdoo.moneyplanner.domain

data class BudgetItem(
    var id: Int,
    val title: String,
    val all: Double,
    val spent: Double
)
