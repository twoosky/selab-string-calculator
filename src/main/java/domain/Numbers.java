package domain;

import model.IndexNumbers;

import java.util.ArrayList;
import java.util.List;

public class Numbers {

  private final List<Number> numbers = new ArrayList<>();

  public Numbers(List<String> formulas) {
    startNumbers(formulas);
  }

  private void startNumbers(List<String> formulas) {
    try {
      setNumbers(formulas);
      validateSize(numbers);
    } catch (NumberFormatException e) {
      throw new IllegalArgumentException("정확히 식을 입력해주세요");
    }
  }

  private void setNumbers(List<String> formulas) {
    for (int index = 0; index < formulas.size(); index++) {
      if (isNumberIndex(index)) {
        this.numbers.add(new Number(formulas.get(index)));
      }
    }
  }

  private boolean isNumberIndex(int index) {
    return index % IndexNumbers.indexSecond == 0;
  }

  private void validateSize(List<Number> numbers) {
    if (this.numbers.size() == IndexNumbers.indexZero) {
      throw new IllegalArgumentException("숫자를 입력해주세요");
    }
  }

  public List<Number> getNumbers() {
    return numbers;
  }
}