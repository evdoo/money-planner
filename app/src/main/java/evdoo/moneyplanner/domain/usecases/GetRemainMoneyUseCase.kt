package evdoo.moneyplanner.domain.usecases

import evdoo.moneyplanner.domain.BudgetRepository

class GetRemainMoneyUseCase(private val budgetRepository: BudgetRepository) {

    fun getRemainMoney(): Double {
        return budgetRepository.getRemainMoney()
    }
}