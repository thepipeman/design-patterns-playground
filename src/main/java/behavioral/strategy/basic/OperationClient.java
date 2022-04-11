package behavioral.strategy.basic;

public class OperationClient {

  public static void main(String[] args) {
    final OperationContext context = new OperationContext();

    final OperationStrategy additionStrategy = new AdditionStrategy();
    context.setStrategy(additionStrategy);
    final double sum = context.execute(5.0, 6.5);
    System.out.printf("Result for addition strategy %.2f", sum);
    System.out.println("");

    final OperationStrategy subtractionStategy = new SubtractionStrategy();
    context.setStrategy(subtractionStategy);
    final double diff = context.execute(10.0, 3.5);
    System.out.printf("Result for subtraction strategy %.2f", diff);
    System.out.println("");

    final OperationStrategy multiplicationStrat = new MultiplicationStrategy();
    context.setStrategy(multiplicationStrat);
    final double product = context.execute(10.0, 3.5);
    System.out.printf("Result for substraction strategy %.2f", product);
  }
}
