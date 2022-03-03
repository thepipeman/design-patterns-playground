package creational.abstractfactory.visa;

import creational.abstractfactory.CreditCard;
import lombok.EqualsAndHashCode;
import lombok.Value;
import lombok.experimental.SuperBuilder;

@Value
@SuperBuilder
@EqualsAndHashCode(callSuper = true)
public class VisaRegularCard extends CreditCard {

  @Override
  protected String getType() {
    return VisaCardType.REGULAR.name();
  }
}
