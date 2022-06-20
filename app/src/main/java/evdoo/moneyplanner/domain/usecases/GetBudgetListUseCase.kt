package evdoo.moneyplanner.domain.usecases

import evdoo.moneyplanner.domain.BudgetItem
import evdoo.moneyplanner.domain.BudgetRepository

class GetBudgetListUseCase(private val budgetRepository: BudgetRepository) {

    fun getBudgetList() : List<BudgetItem> {
        return budgetRepository.getBudgetList()
    }
}