import controller.Calculator;
import controller.MakeNumListAndOperatorList;
import viewer.InputView;
import viewer.OutView;

public class Play {
    public static void main(String[] args) {
        String init = InputView.initFormula();
        MakeNumListAndOperatorList makeList = new MakeNumListAndOperatorList(init);
        Calculator calculator = new Calculator();
        OutView.resultPrint(calculator.result(makeList.getNumList(), makeList.getOperatorList()));
    }
}