package structural.facade;

import lombok.*;

@Data
@Builder(toBuilder = true)
@AllArgsConstructor
public class Account {

  @NonNull
  private Double balance;
  @NonNull
  private String number;

  public static Account of(String number, Double balance) {
    return Account.builder()
      .number(number)
      .balance(balance)
      .build();
  }
}
