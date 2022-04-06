package structural.facade.service;

import lombok.NoArgsConstructor;
import structural.facade.Account;

@NoArgsConstructor
class AccountCreditService {

  void creditAccount(Account account, Double amount) {
    final var updatedBalance = account.getBalance() + amount;
    account.setBalance(updatedBalance);
  }
}
