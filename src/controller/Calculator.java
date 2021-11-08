package controller;

import viewer.OutView;
import java.util.ArrayList;

public class Calculator {
    CalculatorController calculatorController = new CalculatorController();
    OutView outView =new OutView();

    ArrayList<Integer> formulaNumList;
    ArrayList<Character> formulaOperatorList;
    int sum=0;
    int result=0;

    public int result(ArrayList<Integer>  formulaNumList,  ArrayList<Character> formulaOperatorList){
        this.formulaOperatorList = formulaOperatorList;
        this.formulaNumList = formulaNumList;

        result = calculatorController.calculate(this.formulaNumList.get(0), this.formulaOperatorList.get(0), this.formulaNumList.get(1));
        for(int i=1; i<formulaOperatorList.size();i++){
               sum = calculatorController.calculate(result, this.formulaOperatorList.get(i), this.formulaNumList.get(i+1));
        }
        outView.print(sum);
        return sum;
    }
}
