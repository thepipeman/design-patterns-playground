package creational.abstractfactory.visa;

import creational.abstractfactory.*;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@NoArgsConstructor
public class VisaCreditCardFactory implements CreditCardFactory {

  public CreditCard create(CreditScore creditScore) {
    switch (creditScore) {
      case MEDIUM:
        return VisaRegularCard.builder()
          .brand(CreditCardBrand.VISA)
          .name("XXX Regular Card")
          .limit(BigDecimal.valueOf(50000))
          .build();
      case HIGH:
        return VisaBlackCard.builder()
          .brand(CreditCardBrand.VISA)
          .name("XXX Black Card")
          .limit(BigDecimal.valueOf(500000))
          .build();
      default:
        return null;
    }
  }
}
