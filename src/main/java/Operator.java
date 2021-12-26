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

  public static int calculating(int frontNumber, String input_Symbol, int behindNumber) {
    return Arrays.stream(Operator.values())
        .filter((operator -> matchSymbol(operator, input_Symbol)))
        .findAny()
        .map(operator -> doCalculate(frontNumber, operator, behindNumber))
        .orElseThrow(() -> new IllegalArgumentException("올바른 연산자가 아닙니다."));
  }

  private static boolean matchSymbol(Operator operator, String input_Symbol) {
    return operator.symbol.equals(input_Symbol);
  }

  private static int doCalculate(int frontNumber, Operator operator, int behindNumber) {
    return operator.calculate.applyAsInt(frontNumber, behindNumber);
  }


}

