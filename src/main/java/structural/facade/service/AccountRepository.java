package structural.facade.service;

import structural.facade.Account;

import java.util.HashMap;
import java.util.Map;

class AccountRepository {

  public final Map<String, Account> accountsRepo = new HashMap<>();

  public AccountRepository() {
    accountsRepo.put("123", Account.of("123", 500.0));
    accountsRepo.put("456", Account.of("456", 1000.0));
  }

  public Account getAccount(String accountNumber) {
    return accountsRepo.get(accountNumber);
  }
}
