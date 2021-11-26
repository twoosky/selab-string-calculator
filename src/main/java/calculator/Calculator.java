package calculator;

import java.util.LinkedList;
import java.util.Queue;

public class Calculator {
    public int result;
    public String formula;

    public Queue<Number> number = new LinkedList<>();
    public Queue<Operator> operator = new LinkedList<>();

    public Calculator(){

    }

    public void setFormula(String formula){
        this.formula = formula;
    }

    public String getFormula(){
        return formula;
    }

    public void setResult(int result){
        this.result = result;
    }

    public int getResult(){
        return result;
    }
}
