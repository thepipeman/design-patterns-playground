package behavioral.strategy.basic;

import lombok.Data;

@Data
public class OperationContext {

  private OperationStrategy strategy;

  double execute(double a, double b) {
    return this.strategy.execute(a, b);
  }
}
