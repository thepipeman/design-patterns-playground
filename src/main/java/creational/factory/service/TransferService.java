package creational.factory.service;

import java.math.BigDecimal;

public interface TransferService {

  boolean supports(TransferChannel channel);

  void transfer(BigDecimal amount);
}
