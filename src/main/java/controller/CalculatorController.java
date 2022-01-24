package controller;

import domain.Calculator;
import domain.Number;
import domain.Numbers;
import domain.Operators;
import model.IndexNumbers;
import viewer.InputView;
import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;


public class CalculatorController {

  InputView inputView = new InputView();
  Numbers numbers = new Numbers(inputView.getFormulaList());
  Operators operators = new Operators(inputView.getFormulaList());
  Calculator calculator = new Calculator(changeDataType(numbers.getNumbers()), operators.getOperators());

  private double calculatedResult;

  public CalculatorController() throws IOException {
    start(changeDataType(numbers.getNumbers()), operators.getOperators());
  }

  private void start(List<Integer> numbers, List<String> operators) {
    chooseCalculator(numbers, operators);
  }

  //Num->Integer로 변환
  private List<Integer> changeDataType(List<Number> numbers) {
    return numbers.stream()
        .mapToInt(Number::getNumberMember)
        .boxed()
        .collect(Collectors.toList());
  }

  //계산기 컵버터
  private void chooseCalculator(List<Integer> numbers, List<String> operators) {
    if (operators.size() == IndexNumbers.indexFirst) {
      calculator.binaryCalculator(numbers, operators);
      calculatedResult = calculator.getResult();
    }
    calculator.multiCalculator(numbers, operators);
    calculatedResult = calculator.getResult();
  }

  public double getCalculatedResult() {
    return calculatedResult;
  }
}