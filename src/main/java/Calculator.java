import java.util.*;
import java.util.stream.Stream;

public class Calculator {

  protected int isProgressing(List<String> inputs, int result) {
    Numbers numbers = new Numbers(inputs);
    Operator operator = new Operator(inputs);
    for (int i = 0; i < operator.getSize(); i++) {
      if (i == operator.getSize() - 1) {
        break;
      }
      result = calculating(numbers, operator, i);
      numbers.finishedCalculateNumber(result);
    }
    return result;
  }

  private int calculating(Numbers numbers, Operator operator, int index) {
    return Operators.calculating(
        numbers.getNumbers(0),
        operator.getOperator(index),
        numbers.getNumbers(1));
  }

}


    /*while (true) {

      String operator = inputs.get(OPERATOR_INDEX);
      int frontNumber = Integer.parseInt(inputs.get(FRONT_NUMBER));
      int behindNumber = Integer.parseInt(inputs.get(BEHIND_NUMBER));
      answer = Operators.calculating(frontNumber, operator, behindNumber);

      removeUsedIndex(inputs);

      if (inputs.isEmpty()) {
        break;
      }

      addUpResult(inputs, String.valueOf(answer));
    }
    return answer;
  }

  private void removeUsedIndex(List<String> inputs) {
    for (int i = 0; i < 3; i++) {
      inputs.remove(FRONT_NUMBER);
    }
  }

  private void addUpResult(List<String> inputs, String result) {
    inputs.add(FRONT_NUMBER, String.valueOf(result));
  }
}

*/
