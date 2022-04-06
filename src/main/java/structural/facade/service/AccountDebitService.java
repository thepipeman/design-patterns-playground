package structural.facade.service;

import lombok.NoArgsConstructor;
import structural.facade.Account;

@NoArgsConstructor
class AccountDebitService {

  void debitAccount(Account account, double amount) {
    final var updatedBalanace = account.getBalance() - amount;
    account.setBalance(updatedBalanace);
  }
}
