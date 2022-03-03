package creational.factory.service;

import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@NoArgsConstructor
class WiseTransferChannel implements TransferService {

  @Override
  public boolean supports(TransferChannel channel) {
    return channel == TransferChannel.WISE;
  }

  @Override
  public void transfer(BigDecimal amount) {
    System.out.println(String.format("Transferred %n using WISE.", amount.doubleValue()));
  }
}
