package structural.facade.service;

import lombok.NoArgsConstructor;
import structural.facade.Account;

@NoArgsConstructor
public class AccountDebitRealService implements structural.proxy.AccountDebitService {

  @Override
  public void debitAccount(Account account, double amount) {
    final var updatedBalance = account.getBalance() - amount;
    account.setBalance(updatedBalance);
  }
}
