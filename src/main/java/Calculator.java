import java.util.*;
import java.util.stream.IntStream;

public class Calculator {

  final static int ZERO = 0;
  final static int Even = 2;

  public int onProgress(List<String> inputs) {
    int calculatedResult = getInitValue(inputs);
    calculatedResult = IntStream.range(ZERO, inputs.size())
        .filter(Calculator::isOddIndex)
        .reduce(calculatedResult, (init, index) -> toExpression(inputs, index, init));
    return calculatedResult;
  }

  private static boolean isOddIndex(int index) {
    return index % Even != ZERO;
  }

  private static int getInitValue(List<String> inputs) {
    return Number.mapToInt(inputs.get(ZERO));
  }

  private static int toExpression(List<String> inputs, int index, int calculatedResult) {
    return calculate(inputs.get(index), calculatedResult, inputs.get(index + 1));
  }

  private static int calculate(String operator, int frontOperand, String behindOperand) {
    return Operator
        .verifySymbol(operator)
        .applyOperand(frontOperand, Number.mapToInt(behindOperand));
  }

}

