package controller;

import java.util.List;

import static model.Operator.calculate;

public class Calculator {
    protected static final int indexZero = 0;
    protected static final int indexFirst = 1;
    protected static final int indexSecond = 2;
    private int sum;
    private int firstSum;

    private int firstResult(List<Integer> formulaNumList, List<String> formulaOperatorList) {
        return calculate(formulaNumList.get(indexZero), formulaOperatorList.get(indexZero), formulaNumList.get(indexFirst));
    }

    public int result(List<Integer> formulaNumList, List<String> formulaOperatorList) {
        this.firstSum = firstResult(formulaNumList, formulaOperatorList);
        if (formulaOperatorList.size() == indexFirst)
            this.sum = firstSum;
        sumCalculator(formulaNumList, formulaOperatorList);
        return sum;
    }

    private void sumCalculator(List<Integer> formulaNumList, List<String> formulaOperatorList) {
        for (int i = indexFirst; i < formulaOperatorList.size(); i++) {
            this.sum = calculate(firstSum, formulaOperatorList.get(i), formulaNumList.get(i + indexFirst));
        }
    }
}