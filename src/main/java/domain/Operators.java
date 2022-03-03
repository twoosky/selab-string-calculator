package domain;

import model.IndexNumbers;

import java.util.ArrayList;
import java.util.List;

public class Operators {

  private final List<String> operators = new ArrayList<>();

  public Operators(List<String> formulas) {
    setOperators(formulas);
    validateSize(formulas);
  }

  //operators 리스트 생성
  private void setOperators(List<String> formulas) {
    for (int index = IndexNumbers.indexZero; index < formulas.size(); index++) {
      if (isOperatorIndex(index)) {
        operators.add(formulas.get(index));
        continue;
      }
    }
  }

  private boolean isOperatorIndex(int index) {
    return index % IndexNumbers.indexSecond == IndexNumbers.indexFirst;
  }

  public List<String> getOperators() {
    return operators;
  }

  private void validateSize(List<String> operators) {
    if (operators.size() == IndexNumbers.indexZero) {
      throw new IllegalArgumentException("기호를 입력해주세요");
    }
  }
}