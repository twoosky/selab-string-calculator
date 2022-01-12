package controller;

import java.util.ArrayList;
import java.util.List;

public class Nums {

    private final List<Num> numList = new ArrayList<>();

    public Nums(List<String> changeArray) {
        makeNumList(changeArray);
        validateSize(getNumList());
    }

    private void makeNumList(List<String> changeArray) {
        for(int index = 0; index< changeArray.size();index++){
            if(isNumIndex(index))
                this.numList.add(new Num(changeArray.get(index)));
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