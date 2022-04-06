package structural.facade.service;

public class AccountTransferService {

  public void transfer(String sourceAccountNumber, String targetAccountNumber, Double amount) {
    final var repo = new AccountRepository();

    final var sourceAccount = repo.getAccount(sourceAccountNumber);
    final var targetAccount = repo.getAccount(targetAccountNumber);

    final var debitor = new AccountDebitRealService();
    debitor.debitAccount(sourceAccount, amount);
    System.out.printf("Source account %s new balance %.2f", sourceAccount.getNumber(), sourceAccount.getBalance());
    System.out.println("");

    final var creditor = new AccountCreditService();
    creditor.creditAccount(targetAccount, amount);
    System.out.printf("Target account %s new balance %.2f", targetAccount.getNumber(), targetAccount.getBalance());
  }

}
