import controller.*;
import viewer.InputView;
import viewer.OutView;

public class CalculatorMain {
    public static void main(String[] args) {
        SelectString init = new SelectString(InputView.initFormula());
        Num num = new Num(init.getChangeArray());
        Nums nums = new Nums(num.setNumList());
        OperatorList operatorList = new OperatorList(init.getChangeArray());
        Calculator calculator = new Calculator(num.setNumList(), operatorList.getOperatorList());
        OutView.resultPrint(calculator.result(num.setNumList(), operatorList.getOperatorList()));
    }
}