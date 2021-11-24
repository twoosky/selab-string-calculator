package controller;

import java.util.ArrayList;
import java.util.List;

public class MakeNumListAndOperatorList {
    private List<Integer> numList = new ArrayList<>();
    private List<String> operatorList = new ArrayList<>();
    private final String[] changeArrayTray;

    public MakeNumListAndOperatorList(String formula) {
        this.changeArrayTray = formula.split(" ");
        divsionArrayList();
    }

    private void divsionArrayList() {
        for (int i = Calculator.indexZero; i < this.changeArrayTray.length; i++)
            setArray(i);
    }

    private void setArray(int i) {
        try {
            if (i % Calculator.indexSecond != Calculator.indexZero) {
                operatorList.add(changeArrayTray[i]);
            } else {
                numList.add(Integer.parseInt(changeArrayTray[i]));
            }
        } catch (Exception e) {
            System.out.println("올바르지 않은 입력입니다.");
        }
    }

    public List<Integer> getNumList() {
        return numList;
    }

    public List<String> getOperatorList() {
        return operatorList;
    }
}