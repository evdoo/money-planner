package evdoo.moneyplanner.domain.usecases

import evdoo.moneyplanner.domain.BudgetItem
import evdoo.moneyplanner.domain.BudgetRepository

class EditBudgetItemUseCase(private val budgetRepository: BudgetRepository) {

    fun editBudgetItem(budgetItem: BudgetItem) {
        budgetRepository.editBudgetItem(budgetItem)
    }
}