import controller.SelectFormula;
import controller.Synthesis;
import viewer.InputView;
import viewer.OutView;
public class Calculator{
    public static void main(String[] args){
        InputView inputView = new InputView();
        OutView outView = new OutView();
        SelectFormula selectFormula = new SelectFormula(inputView.initFormula());
        Synthesis synthesis = new Synthesis();
         outView.resultPrint(synthesis.result(selectFormula.getNumList(), selectFormula.getOperatorList()));
    }
}