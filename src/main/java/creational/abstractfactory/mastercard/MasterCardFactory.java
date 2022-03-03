package creational.abstractfactory.mastercard;

import creational.abstractfactory.*;

import java.math.BigDecimal;

public class MasterCardFactory implements CreditCardFactory {

  public CreditCard create(CreditScore creditScore) {
    switch (creditScore) {
      case MEDIUM:
        return MasterCardCashBack.builder()
          .brand(CreditCardBrand.MASTERCARD)
          .name("XXX Cash Back")
          .limit(BigDecimal.valueOf(25000))
          .build();
      case HIGH:
        return MasterCardGold.builder()
          .brand(CreditCardBrand.MASTERCARD)
          .name("XXX Gold")
          .limit(BigDecimal.valueOf(500000))
          .build();
      default:
        return null;
    }
  }
}
