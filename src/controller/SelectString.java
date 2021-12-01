package controller;

public class SelectString {
    public final String[] changeArray;

    public SelectString(String formula) {
        changeArray = formula.split(" ");
    }

    public String[] getChangeArray(){
        return changeArray;
    }
}