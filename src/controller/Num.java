package controller;

import java.util.List;

public class Num {
    private int numAdd;

    public Num getNumList(List<String> changeArray, int index) {
        this.numAdd = Integer.parseInt(changeArray.get(index));
        return this;
    }
}
