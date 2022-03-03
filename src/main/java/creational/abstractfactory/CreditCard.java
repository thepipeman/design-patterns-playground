package creational.abstractfactory;

import lombok.experimental.SuperBuilder;

import java.math.BigDecimal;

@SuperBuilder
public abstract class CreditCard {

  String name;
  CreditCardBrand brand;
  BigDecimal limit;

  protected abstract String getType();
}
