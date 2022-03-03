package creational.factory.service;

import java.util.HashSet;
import java.util.Set;

public class TransferServiceFactory {

  private final static Set<TransferService> transferServices = new HashSet<>();

  public TransferServiceFactory() {
    transferServices.add(new SwiftTransferService());
    transferServices.add(new WiseTransferChannel());
  }

  public TransferService create(TransferChannel channel) {
    return transferServices.stream()
      .filter(s -> s.supports(channel))
      .findFirst()
      .get();
  }
}
