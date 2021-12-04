import Operators.*;
import java.util.*;

public class Calculator {

  private final static Progress PROGRESS = new Progress();
  private final static int FRONT_NUMBER = 0;
  private final static int OPERATOR_INDEX = 1;
  private final static int BEHIND_NUMBER = 2;

  protected int isProgressing(List<String> inputs, int answer) {
    while (true) {

      String operator = inputs.get(OPERATOR_INDEX);
      int frontNumber = Integer.parseInt(inputs.get(FRONT_NUMBER));
      int behindNumber = Integer.parseInt(inputs.get(BEHIND_NUMBER));

      switch (operator) {
        case "+":
          answer = PROGRESS.calculating(new Plus(), frontNumber, behindNumber);
          break;
        case "-":
          answer = PROGRESS.calculating(new Minus(), frontNumber, behindNumber);
          break;
        case "*":
          answer = PROGRESS.calculating(new Multiple(), frontNumber, behindNumber);
          break;
        case "/":
          answer = PROGRESS.calculating(new Divide(), frontNumber, behindNumber);
          break;
      }
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


