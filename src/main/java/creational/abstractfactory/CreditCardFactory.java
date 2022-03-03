package creational.abstractfactory;

public interface CreditCardFactory {
  CreditCard create(CreditScore score);
}
