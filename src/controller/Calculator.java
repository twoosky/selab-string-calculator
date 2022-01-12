package controller;

import java.util.List;
import java.util.stream.Collectors;

import static model.Operator.calculate;

public class Calculator {
    protected static final int indexZero = 0;
    protected static final int indexFirst = 1;
    protected static final int indexSecond = 2;
    private final int binaryResult;
    private int result;

    public Calculator(List<Num> numList, List<String> operatorList) {
        this.binaryResult = binaryCalculator(changeIntList(numList), operatorList);
    }

    //Num->Integer로 변환
    private List<Integer> changeIntList(List<Num> numList){
        return numList.stream()
               .mapToInt(Num::getNumMember)
               .boxed()
               .collect(Collectors.toList());
    }

    //항의 개수가 2개를 계산하는 계산기
    private Integer binaryCalculator(List<Integer> intList, List<String> operatorList) {
        return calculate(intList.get(indexZero),
                operatorList.get(indexZero),
               intList.get(indexFirst));
    }

    // 항의 개수가 3개 이상 계산하는 계산기
    private void multiCalculator(List<Num> numList, List<String> operatorList) {
        this.result = binaryResult;
        List<Integer> intList = changeIntList(numList);
        for (int i = indexFirst; i < operatorList.size(); i++) {
            int midSum = calculate(result,
                    operatorList.get(i),
                    intList.get(i + indexFirst));
            result = midSum;
        }
    }

    // 계산기 선별기
    public int calculatorSelection (List<Num> intList, List<String> operatorList) {
        if (operatorList.size() == indexFirst)
            return binaryResult;
        multiCalculator(intList, operatorList);
        return result;
    }
}