package controller;

import java.util.List;

public class Nums {
    private final List<Integer> numList;

    public Nums(List<Integer> numList) {
        this.numList = numList;
        validateSize(this.numList);
    }

    private void validateSize(List<Integer> numList) {
        if (this.numList.size() == Calculator.indexZero)
            throw new IllegalArgumentException("식을 입력해주세요");
    }
}