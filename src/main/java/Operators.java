import java.util.Arrays;
import java.util.function.IntBinaryOperator;

public enum Operators {
  PLUS("+", (frontNumber, behindNumber) -> frontNumber + behindNumber),
  MINUS("-", (frontNumber, behindNumber) -> frontNumber - behindNumber),
  MULTIPLE("*", (frontNumber, behindNumber) -> frontNumber * behindNumber),
  DIVIDE("/", (frontNumber, behindNumber) -> frontNumber / behindNumber),
  REMINDER("%", (frontNumber, behindNumber) -> frontNumber % behindNumber);


  private final String symbol;
  private final IntBinaryOperator calculate;

  Operators(String symbol, IntBinaryOperator calculate) {
    this.symbol = symbol;
    this.calculate = calculate;
  }

  public static int calculating(int frontNumber, String input_Symbol, int behindNumber) {
    return Arrays.stream(Operators.values())
        .filter((operators -> matchSymbol(operators, input_Symbol)))
        .findAny()
        .map(operators -> doCalculate(frontNumber, operators, behindNumber))
        .orElseThrow(() -> new IllegalArgumentException("올바른 연산자가 아닙니다."));
  }

  private static boolean matchSymbol(Operators operators, String input_Symbol) {
    return operators.symbol.equals(input_Symbol);
  }

  private static int doCalculate(int frontNumber, Operators operators, int behindNumber) {
    return operators.calculate.applyAsInt(frontNumber, behindNumber);
  }


}

