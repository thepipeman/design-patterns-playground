package structural.facade;

import structural.facade.service.AccountTransferService;

public class AccountClient {

  public static void main(String[] args) {
    final var transferService = new AccountTransferService();
    transferService.transfer("123", "456", 150.0);
  }
}
