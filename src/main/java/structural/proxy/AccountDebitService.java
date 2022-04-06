package structural.proxy;

import structural.facade.Account;

public interface AccountDebitService {

  void debitAccount(Account account, double amount);

}
