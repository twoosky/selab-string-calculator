import controller.*;
import viewer.InputView;
import viewer.OutView;

public class CalculatorMain {
    public static void main(String[] args) {
    SelectString selectString = new SelectString(InputView.initFormula());
    Nums nums = new Nums(selectString.getChangeArray());
    }
}