import java.util.*;

public class Calculator {

  public final static int REMAIN_NUMBER = 2;

  public int isProgressing(List<String> inputs, int result) {

    Numbers numbers = new Numbers(inputs);
    Operator operator = new Operator(inputs);
    for (int i = 0; i < operator.getSize(); i++) {
      result = calculating(numbers, operator, i);
      if (numbers.getSize() > REMAIN_NUMBER) {
        numbers.removeAndAddNumber(result);
      }
    }
    return result;
  }

  private static int calculating(Numbers numbers, Operator operator, int index) {
    return Operator.calculating(
        numbers.getNumbers(Number.FRONT_NUMBER),
        operator.getOperator(index),
        numbers.getNumbers(Number.BEHIND_NUMBER));
  }

}

