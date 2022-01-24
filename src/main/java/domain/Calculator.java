package domain;

import model.IndexNumbers;

import java.util.List;

import static model.Operator.calculate;

public class Calculator {

  private double temporaryResult;
  private double result;

  public Calculator(List<Integer> numbers, List<String> operators) {
    startCalculate(numbers, operators);
  }

  private void startCalculate(List<Integer> numbers, List<String> operators) {
    this.result = binaryCalculator(numbers, operators);
  }

  //항의 개수가 2개를 계산하는 계산기
  public Double binaryCalculator(List<Integer> numbers, List<String> operators) {
    return calculate(numbers.get(IndexNumbers.indexZero),
        operators.get(IndexNumbers.indexZero),
        numbers.get(IndexNumbers.indexFirst));
  }

  // 항의 개수가 3개 이상 계산하는 계산기
  public void multiCalculator(List<Integer> numberList, List<String> operatorList) {
    for (int i = IndexNumbers.indexFirst; i < operatorList.size(); i++) {
      temporaryResult = calculate((int) result,
          operatorList.get(i),
          numberList.get(i + IndexNumbers.indexFirst));
      this.result = temporaryResult;
    }
  }

  public double getResult() {
    return result;
  }
}