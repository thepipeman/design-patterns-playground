package creational.abstractfactory.mastercard;

import creational.abstractfactory.CreditCard;
import lombok.EqualsAndHashCode;
import lombok.Value;
import lombok.experimental.SuperBuilder;

@Value
@SuperBuilder
@EqualsAndHashCode(callSuper = true)
public class MasterCardCashBack extends CreditCard {
  @Override
  protected String getType() {
    return MasterCardType.CASH_BACK.name();
  }
}
