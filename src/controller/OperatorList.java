package controller;

import java.util.ArrayList;
import java.util.List;

public class OperatorList {
    private final List<String> operatorList = new ArrayList<>();

    public OperatorList(String[] changeArray) {
        setOperatorList(changeArray);
        validateSize(List.of(changeArray));
    }

    private void setOperatorList(String[] changeArray) {
        for (int i = Calculator.indexZero; i < changeArray.length; i++) {
            if (i % Calculator.indexSecond != Calculator.indexZero) {
                operatorList.add(changeArray[i]);
                continue;
            }
        }
    }

    public List<String> getOperatorList() {
        return operatorList;
    }

    private void validateSize(List<String> operatorList) {
        if (operatorList.size() == Calculator.indexZero)
            throw new IllegalArgumentException("기호를 입력해주세요");
    }
}