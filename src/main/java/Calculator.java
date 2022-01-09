import java.util.*;
import java.util.stream.IntStream;

public class Calculator {

  public int onProgress(List<String> inputs) {
    int calculatedResult = getCalculatedResult(inputs);
    calculatedResult = IntStream.range(0, inputs.size())
        .filter(Calculator::isEvenIndex)
        .reduce(calculatedResult, (init, index) -> toExpression(inputs, index, init));
    return calculatedResult;
  }

  private static boolean isEvenIndex(int i) {
    return i % 2 != 0 && i > 0;
  }

  private static int getCalculatedResult(List<String> inputs) {
    return Number.mapToInt(inputs.get(0));
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

