import controller.CalculatorController;
import viewer.OutView;

import java.io.IOException;

public class Calculator {

  public static void main(String[] args) throws IOException {
    CalculatorController calculatorController = new CalculatorController();
    OutView outView = new OutView();
    outView.resultPrint(calculatorController.getCalculatedResult());
  }
}