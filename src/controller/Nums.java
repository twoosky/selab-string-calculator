package controller;

import java.util.ArrayList;
import java.util.List;

public class Nums {
    Num num = new Num();
    private List<Num> numList = new ArrayList<>();

    public Nums(List<String> changeArray) {
        makeNumList(changeArray);
        getNumList();
        validateSize(this.numList);
    }

    private void makeNumList(List<String> changeArray) {
        for(int index = 0; index< changeArray.size();index++){
            if(isNumIndex(index)){
                numList.add(num.getNumList(changeArray, index));
            }
        }
    }

    private boolean isNumIndex(int index) {
        return index % Calculator.indexSecond == 0;
    }

    private void validateSize(List<Num> numList) {
        if (this.numList.size() == Calculator.indexZero)
            throw new IllegalArgumentException("식을 입력해주세요");
    }

    public List<Num> getNumList() {
        return numList;
    }
}