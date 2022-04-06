package structural.proxy;

import structural.facade.Account;
import structural.facade.service.AccountDebitRealService;

public class AccountDebitValidationService implements AccountDebitService {

  private final AccountDebitService debitService;

  public AccountDebitValidationService() {
    debitService = new AccountDebitRealService();
  }

  @Override
  public void debitAccount(Account account, double amount) {
    final var currentBalance = account.getBalance();
    if (currentBalance < amount) {
      throw new RuntimeException("Amount to debit exceeds the current balance.");
    }

    debitService.debitAccount(account, amount);
    System.out.printf("new account balance after debit %.2f \n", account.getBalance());
  }
}
