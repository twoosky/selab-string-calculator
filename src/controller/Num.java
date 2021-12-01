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
            if ( isNumIndex(i) )
                numList.add(Integer.parseInt(changeArray[i]));
        }
    }

    private boolean isNumIndex(int index) {
        return index % Calculator.indexSecond == 0;
    }

    public List<Integer> setNumList() {
        return numList;
    }
}