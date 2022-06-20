package evdoo.moneyplanner.domain.usecases

import evdoo.moneyplanner.domain.BudgetRepository

class TransferMoneyUseCase(private val budgetRepository: BudgetRepository) {

    fun transferMoney(
        oldItemId: Int,
        newItemId: Int,
        sum: Double) {
        budgetRepository.transferMoney(oldItemId, newItemId, sum)
    }
}