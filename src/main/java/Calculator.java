import java.util.*;

public class Calculator {

  public final static int REMAIN_NUMBER = 2;

  public int isProgressing(List<String> inputs, int result) {
    for (int i = 0; i < operator.getSize(); i++) {
      result = calculating(numbers, operator, i);
      if (numbers.getSize() > REMAIN_NUMBER) {
        numbers.removeAndAddNumber(result);
      }
    }
    return result;
  }

  private static int calculating(String operator, int frontNumber, int behindNumber) {
    return Operator.using(operator).doCalculate(frontNumber, behindNumber);

  }

}

