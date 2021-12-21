package controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SelectString {
    private List<String> changeArray = new ArrayList<>();
    private String[] set;

    public SelectString(String formula) {
       setList(formula);
    }
    private void setList(String formula){
        set = formula.split(" ");
        this.changeArray.addAll(Arrays.asList(set));
    }

    public List<String> getChangeArray(){
        return changeArray;
    }
}