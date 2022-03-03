package creational.abstractfactory.visa;

import creational.abstractfactory.CreditCard;
import lombok.EqualsAndHashCode;
import lombok.Value;
import lombok.experimental.SuperBuilder;

@EqualsAndHashCode(callSuper = true)
@Value
@SuperBuilder
public class VisaBlackCard extends CreditCard {

  public String getType() {
    return VisaCardType.BLACK.name();
  }
}
