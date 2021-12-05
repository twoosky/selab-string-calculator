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

  public static int calculating (int frontNumber, String input_Symbol, int behindNumber) {
    for (Operators operators : Operators.values() ) {
      if (operators.equals(input_Symbol)) {
        return operators.calculate.applyAsInt(frontNumber,behindNumber);
      }
    }
    throw new RuntimeException();
  }

}

