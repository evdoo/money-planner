package evdoo.moneyplanner.domain.usecases

import evdoo.moneyplanner.domain.BudgetRepository

class DeleteBudgetItemUseCase(private val budgetRepository: BudgetRepository) {

    fun deleteBudgetItem(id: Int) {
        budgetRepository.deleteBudgetItem(id)
    }
}