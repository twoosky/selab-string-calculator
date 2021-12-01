package controller;

import java.util.List;

import static model.Operator.calculate;

public class Calculator {
    protected static final int indexZero = 0;
    protected static final int indexFirst = 1;
    protected static final int indexSecond = 2;
    private int firstSum;
    private int sum;
    private int result;

    public Calculator(List<Integer> numList, List<String> operatorList) {
        this.firstSum = firstResult(numList, operatorList);
    }

    private int firstResult(List<Integer> formulaNumList, List<String> formulaOperatorList) {
        return calculate(formulaNumList.get(indexZero), formulaOperatorList.get(indexZero), formulaNumList.get(indexFirst));
    }

    public int result(List<Integer> formulaNumList, List<String> formulaOperatorList) {
        if (formulaOperatorList.size() == indexFirst)
            this.result = firstSum;
        sumCalculator(formulaNumList, formulaOperatorList);
        return result;
    }

    private int sumCalculator(List<Integer> formulaNumList, List<String> formulaOperatorList) {
        this.sum = firstSum;
        for (int i = indexFirst; i < formulaOperatorList.size(); i++) {
            this.result = calculate(sum, formulaOperatorList.get(i), formulaNumList.get(i + indexFirst));
            sum = this.result;
        }
        return sum;
    }
}