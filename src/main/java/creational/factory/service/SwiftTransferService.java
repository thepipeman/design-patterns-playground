package creational.factory.service;

import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@NoArgsConstructor
class SwiftTransferService implements TransferService {

  @Override
  public boolean supports(TransferChannel channel) {
    return channel == TransferChannel.SWIFT;
  }

  @Override
  public void transfer(BigDecimal amount) {
    System.out.println(String.format("Transferred %n using SWIFT.", amount.doubleValue()));
  }
}
