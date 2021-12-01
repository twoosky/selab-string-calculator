package controller;

import java.util.ArrayList;
import java.util.List;

public class Num {
    private final List<Integer> numList = new ArrayList<>();

    public Num(String[] changeArray) {
        setNumList(changeArray);
    }

    private void setNumList(String[] changeArray) {
        for (int i = Calculator.indexZero; i < changeArray.length; i++) {
            if (i % Calculator.indexSecond == Calculator.indexZero)
                numList.add(Integer.parseInt(changeArray[i]));
        }
    }

    public List<Integer> setNumList() {
        return numList;
    }
}