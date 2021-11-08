
import controller.SelectFormula;
import viewer.InputView;

public class CalculatorService {

    public static void main(String[] args){
        InputView init = new InputView();
        SelectFormula start = new SelectFormula(init.initFormula());
    }
}
