import controller.Nums;
import controller.Operators;
import controller.Select;
import viewer.InputView;
import viewer.OutView;

public class Play {
    public Play(){
        Select select = new Select(InputView.init());
        Operators operators = new Operators(select.getChangeArray());
        Nums nums = new Nums(select.getChangeArray());
        controller.Calculator calculator = new controller.Calculator(nums.getNumList(), operators.getOperatorList());
        OutView.resultPrint(calculator.calculatorSelection(nums.getNumList(), operators.getOperatorList()));
    }
}
