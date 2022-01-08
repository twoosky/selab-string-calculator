import java.sql.ResultSet;
import java.sql.SQLOutput;
import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Calculator {

  private final static String REGEX = "^[0-9]+$";

  public int onProgress(List<String> inputs) {

    int calculatedResult = Integer.parseInt(inputs.get(0));
    IntStream.range(0, inputs.size())
        .filter(Calculator::isEvenIndex)
        .peek(System.out::println)
        .map(i -> calculate(inputs.get(i), calculatedResult, inputs.get(i + 1)))
        .forEach(System.out::println);
    return calculatedResult;
/*    int calculatedResult = Integer.parseInt(inputs.get(0));
    for (int i = 1; i < inputs.size(); i += 2) {
      calculatedResult = calculate(inputs.get(i), calculatedResult, inputs.get(i + 1));
    }
    return calculatedResult;*/
  }

  private static boolean isEvenIndex(int i) {
    return i % 2 != 0 && i > 0;
  }

  private static int getCalculatedResult(List<String> inputs) {
    return Integer.parseInt(inputs.get(0));
  }

  private static int toLambda(List<String> inputs, int index, int calculatedResult) {
    return calculate(inputs.get(index), calculatedResult, inputs.get(index + 1));
  }

  private static int calculate(String operator, int frontOperand, String behindOperand) {
    return Operator
        .verifySymbol(operator)
        .applyOperand(frontOperand, Integer.parseInt(behindOperand));
  }

}

