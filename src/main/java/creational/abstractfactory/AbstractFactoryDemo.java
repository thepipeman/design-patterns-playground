package creational.abstractfactory;

public class AbstractFactoryDemo {

  public static void main(String[] args) {
    CreditCardAbstractFactory creditCardAbstractFactory = new CreditCardAbstractFactory();

    CreditCard blackVisa = creditCardAbstractFactory.create(CreditCardBrand.VISA, CreditScore.HIGH);
    System.out.println(blackVisa.name);

    CreditCard regularVisa = creditCardAbstractFactory.create(CreditCardBrand.VISA, CreditScore.MEDIUM);
    System.out.println(regularVisa.name);

    CreditCard cashBackMC = creditCardAbstractFactory.create(CreditCardBrand.MASTERCARD, CreditScore.MEDIUM);
    System.out.println(cashBackMC.name);

    CreditCard goldMC = creditCardAbstractFactory.create(CreditCardBrand.MASTERCARD, CreditScore.HIGH);
    System.out.println(goldMC.name);
  }
}
