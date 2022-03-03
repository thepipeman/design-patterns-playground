package creational.abstractfactory;

import creational.abstractfactory.mastercard.MasterCardFactory;
import creational.abstractfactory.visa.VisaCreditCardFactory;

public class CreditCardAbstractFactory {

  public CreditCard create(CreditCardBrand brand, CreditScore creditScore) {
    final CreditCardFactory creditCardFactory = getFactory(brand);
    if (creditCardFactory == null) {
      return null;
    }
    return creditCardFactory.create(creditScore);
  }

  private CreditCardFactory getFactory(CreditCardBrand brand) {
    switch (brand) {
      case VISA:
        return new VisaCreditCardFactory();
      case MASTERCARD:
        return new MasterCardFactory();
      default:
        return null;
    }
  }
}
