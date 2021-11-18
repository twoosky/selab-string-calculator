package controller;

import java.util.ArrayList;
public class SelectFormula {
    protected ArrayList<Integer> numList = new ArrayList<>();
    protected ArrayList<String> operatorList = new ArrayList<>();
    private  String formula;
    private String[] changeArrayTray;
    public SelectFormula(String formula){
        this.formula = formula;
        this.changeArrayTray = this.formula.split(" ");
        divsionArrayList();
    }

    private void divsionArrayList(){
        for(int i=0; i<this.changeArrayTray.length;i++){
            setArray(i);
        }
    }

    private void setArray(int i){
        if(i % 2 != 0) {
            operatorList.add(changeArrayTray[i]);
        }else{
            numList.add(Integer.parseInt(changeArrayTray[i]));
        }
    }

    public  ArrayList<Integer> getNumList() {
        return  numList;
    }

    public  ArrayList<String> getOperatorList() {
        return operatorList;
    }
}

