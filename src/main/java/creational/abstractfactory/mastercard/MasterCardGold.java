package creational.abstractfactory.mastercard;

import creational.abstractfactory.CreditCard;
import lombok.EqualsAndHashCode;
import lombok.Value;
import lombok.experimental.SuperBuilder;

@Value
@SuperBuilder
@EqualsAndHashCode(callSuper = true)
public class MasterCardGold extends CreditCard {
  @Override
  protected String getType() {
    return MasterCardType.GOLD.name();
  }
}
