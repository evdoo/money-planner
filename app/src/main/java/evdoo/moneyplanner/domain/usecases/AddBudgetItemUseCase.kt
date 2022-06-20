package evdoo.moneyplanner.domain.usecases

import evdoo.moneyplanner.domain.BudgetItem
import evdoo.moneyplanner.domain.BudgetRepository

class AddBudgetItemUseCase(private val budgetRepository: BudgetRepository) {

    fun addBudgetItem(item: BudgetItem) {
        budgetRepository.addBudgetItem(item)
    }
}