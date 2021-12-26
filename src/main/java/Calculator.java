import java.util.*;

public class Calculator {

  public int isProgressing(List<String> inputs) {
    int result = Integer.parseInt(inputs.get(0));
    for (int i = 1; i < inputs.size(); i += 2) {
      result = calculating(inputs.get(i), result, inputs.get(i + 1));
    }
    return result;
  }

  private static int calculating(String operator, int frontNumber, String behindNumber) {
    return Operator
        .using(operator)
        .doCalculate(frontNumber, Integer.parseInt(behindNumber));

  }

}

