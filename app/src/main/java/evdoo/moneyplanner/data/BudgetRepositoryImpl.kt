package evdoo.moneyplanner.data

import evdoo.moneyplanner.domain.BudgetItem
import evdoo.moneyplanner.domain.BudgetRepository

object BudgetRepositoryImpl: BudgetRepository {

    override fun addBudgetItem(item: BudgetItem) {
        TODO("Not yet implemented")
    }

    override fun deleteBudgetItem(id: Int) {
        TODO("Not yet implemented")
    }

    override fun editBudgetItem(budgetItem: BudgetItem) {
        TODO("Not yet implemented")
    }

    override fun getBudgetList(): List<BudgetItem> {
        TODO("Not yet implemented")
    }

    override fun getNeedfullMoney(): Double {
        TODO("Not yet implemented")
    }

    override fun getRemainMoney(): Double {
        TODO("Not yet implemented")
    }

    override fun transferMoney(oldItemId: Int, newItemId: Int, sum: Double) {
        TODO("Not yet implemented")
    }
}