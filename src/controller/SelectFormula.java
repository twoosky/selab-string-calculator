package controller;



import java.util.ArrayList;

public class SelectFormula {
    ArrayList<Integer> numList = new ArrayList<Integer>();
    ArrayList<Character> operatorList = new ArrayList<Character>();

    Calculator calculator =  new Calculator();

    String formula = "";
    String num = "";

    public  SelectFormula(String formula) {
        this.formula = formula;
            for (int i = 0; i < this.formula.length(); i++) {
                char charList = this.formula.charAt(i);
                    if (charList == '+' || charList == '-' || charList == '*' || charList == '/') {
                        numList.add(Integer.parseInt(num));
                        operatorList.add(charList);
                        num = "";
                        continue;
                   }
                 num+=charList;

                }
            numList.add(Integer.parseInt(num));
            calculator.result(numList, operatorList);
    }

}
