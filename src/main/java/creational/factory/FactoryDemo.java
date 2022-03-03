package creational.factory;

import creational.factory.service.*;

public class FactoryDemo {

  public static void main(String[] args) {
    final TransferServiceFactory transferServiceFactory = new TransferServiceFactory();

    final TransferService swiftService = transferServiceFactory.create(TransferChannel.SWIFT);
    System.out.println(String.format("Service is of type SWIFT: %s", swiftService.supports(TransferChannel.SWIFT)));

    final TransferService wiseService = transferServiceFactory.create(TransferChannel.WISE);
    System.out.println(String.format("Service is of type WISE: %s", swiftService.supports(TransferChannel.WISE)));
  }
}
