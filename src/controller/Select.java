package controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Select {
    private final List<String> changeList = new ArrayList<>();

    public Select(String formula) {
       setList(formula);
    }

    private void setList(String formula){
        String[] setInit = formula.split(" ");
        this.changeList.addAll(Arrays.asList(setInit));
    }

    public List<String> getChangeArray(){
        return changeList;
    }
}