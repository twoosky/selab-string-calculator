import Operator.Operator;
import java.util.function.IntBinaryOperator;

public enum Operators {
  PLUS("+", (frontNumber, behindNumber) -> frontNumber + behindNumber),
  MINUS("-", (frontNumber, behindNumber) -> frontNumber - behindNumber),
  MULTIPLE("*", (frontNumber, behindNumber) -> frontNumber * behindNumber),
  DIVIDE("/", (frontNumber, behindNumber) -> frontNumber / behindNumber);


  private final String symbol;
  private final IntBinaryOperator calculate;

  Operators(String symbol, IntBinaryOperator calculate) {
    this.symbol = symbol;
    this.calculate = calculate;
  }


}

