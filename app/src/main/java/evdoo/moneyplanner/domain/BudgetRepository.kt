package evdoo.moneyplanner.domain

interface BudgetRepository {

    fun addBudgetItem(item: BudgetItem)

    fun deleteBudgetItem(id: Int)

    fun editBudgetItem(budgetItem: BudgetItem)

    fun getBudgetList() : List<BudgetItem>

    fun getNeedfullMoney(): Double

    fun getRemainMoney(): Double

    fun transferMoney(
        oldItemId: Int,
        newItemId: Int,
        sum: Double)
}