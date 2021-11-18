package controller;

import java.util.ArrayList;
public class Synthesis {
    OperatorMapping operatorMapping = new OperatorMapping();
    private int sum =0;

     int firstResult(ArrayList<Integer>  formulaNumList,  ArrayList<String> formulaOperatorList){
        return operatorMapping.calculate(formulaNumList.get(0), formulaOperatorList.get(0), formulaNumList.get(1));
    }

    public int result(ArrayList<Integer>  formulaNumList, ArrayList<String> formulaOperatorList){
        if (formulaOperatorList.size() == 1)
            this.sum = firstResult(formulaNumList, formulaOperatorList);
        for(int i=1; i<formulaOperatorList.size();i++){
            this.sum = operatorMapping.calculate(firstResult(formulaNumList, formulaOperatorList), formulaOperatorList.get(i), formulaNumList.get(i + 1));
        }
    return sum;
    }


}
