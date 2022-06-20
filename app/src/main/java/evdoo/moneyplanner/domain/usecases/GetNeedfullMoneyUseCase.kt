package evdoo.moneyplanner.domain.usecases

import evdoo.moneyplanner.domain.BudgetRepository

class GetNeedfullMoneyUseCase(private val budgetRepository: BudgetRepository) {

    fun getNeedfullMoney(): Double {
        return budgetRepository.getNeedfullMoney()
    }
}