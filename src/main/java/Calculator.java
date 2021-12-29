import java.util.*;

public class Calculator {

    private final static String REGEX = "^[0-9]+$";

  public int onProgress(List<String> inputs) {
    int calculatedResult = Integer.parseInt(inputs.get(0));
    for (int i = 1; i < inputs.size(); i += 2) {
      calculatedResult = calculate(inputs.get(i), calculatedResult, inputs.get(i + 1));
    }
    return calculatedResult;
  }

  private static int calculate(String operator, int frontOperand, String behindOperand) {
    return Operator
        .verifySymbol(operator)
        .applyOperand(frontOperand, Integer.parseInt(behindOperand));

  }
}

