import java.util.Arrays;
import java.util.function.IntBinaryOperator;

public enum Operator {
  PLUS("+", (frontNumber, behindNumber) -> frontNumber + behindNumber),
  MINUS("-", (frontNumber, behindNumber) -> frontNumber - behindNumber),
  MULTIPLE("*", (frontNumber, behindNumber) -> frontNumber * behindNumber),
  DIVIDE("/", (frontNumber, behindNumber) -> frontNumber / behindNumber),
  REMINDER("%", (frontNumber, behindNumber) -> frontNumber % behindNumber);

  private final String symbol;
  private final IntBinaryOperator calculate;

  Operator(String symbol, IntBinaryOperator calculate) {
    this.symbol = symbol;
    this.calculate = calculate;
  }

  public static Operator using(String input_Symbol) {
    return Arrays.stream(Operator.values())
        .filter((operator -> matchSymbol(operator, input_Symbol)))
        .findFirst()
        .orElseThrow(() -> new IllegalArgumentException("올바른 연산자가 아닙니다."));
  }

  private static boolean matchSymbol(Operator operator, String input_Symbol) {
    return operator.symbol.equals(input_Symbol);
  }

  public int doCalculate(int frontNumber, int behindNumber) {
    return calculate.applyAsInt(frontNumber, behindNumber);
  }


}

