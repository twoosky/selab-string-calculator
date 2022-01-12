package controller;

import java.util.ArrayList;
import java.util.List;

public class Operators {
    private final List<String> operatorList = new ArrayList<>();

    public Operators(List<String> changeArray) {
        setOperatorList(changeArray);
        validateSize(changeArray);
    }

    private void setOperatorList(List<String> changeArray) {
        for (int i = Calculator.indexZero; i < changeArray.size(); i++) {
            if (isOperatorIndex(i)) {
                operatorList.add(changeArray.get(i));
                continue;
            }
        }
    }

    private boolean isOperatorIndex(int index) {
        return index % Calculator.indexSecond == Calculator.indexFirst;
    }

    public List<String> getOperatorList() {
        return operatorList;
    }

    private void validateSize(List<String> operatorList) {
        if (operatorList.size() == Calculator.indexZero)
            throw new IllegalArgumentException("기호를 입력해주세요");
    }
}