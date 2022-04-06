package structural.proxy;

import structural.facade.Account;

public class AccountProxyDemo {

  public static void main(String[] args) {
    final AccountDebitService accountDebitService = new AccountDebitValidationService();
    final Account account = Account.of("123", 500.0);

    // success
    accountDebitService.debitAccount(account, 200);
    // test the proxy it should fail
    accountDebitService.debitAccount(account, 350.0);
  }
}
