import java.util.Arrays;
import java.util.function.IntBinaryOperator;

public enum Operator {
  PLUS("+", (frontOperand, behindOperand) -> frontOperand + behindOperand),
  MINUS("-", (frontOperand, behindOperand) -> frontOperand - behindOperand),
  MULTIPLE("*", (frontOperand, behindOperand) -> frontOperand * behindOperand),
  DIVIDE("/", (frontOperand, behindOperand) -> frontOperand / behindOperand),
  REMINDER("%", (frontOperand, behindOperand) -> frontOperand % behindOperand);

  private final String symbol;
  private final IntBinaryOperator formula;

  Operator(String symbol, IntBinaryOperator formula) {
    this.symbol = symbol;
    this.formula = formula;
  }

  public static Operator verifySymbol(String input_Symbol) {
    return Arrays.stream(Operator.values())
        .filter((operator -> matchSymbol(operator, input_Symbol)))
        .findFirst()
        .orElseThrow(() -> new IllegalArgumentException("올바른 연산자가 아닙니다."));
  }

  private static boolean matchSymbol(Operator operator, String input_Symbol) {
    return operator.symbol.equals(input_Symbol);
  }

  public int applyOperand(int frontOperand, int behindOperand) {
    return formula.applyAsInt(frontOperand, behindOperand);
  }


}

