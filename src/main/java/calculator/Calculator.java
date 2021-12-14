package calculator;

import calculation.*;
import calculatorIO.Input;
import calculatorIO.Output;

import java.util.LinkedList;
import java.util.Queue;

public class Calculator {
    public int result;
    public String formula;

    public Queue<Number> number = new LinkedList<>();
    public Queue<Operator> operator = new LinkedList<>();

    public final Plus PLUS = new Plus();
    public final Minus MINUS = new Minus();
    public final Times TIMES = new Times();
    public final Division DIVISION = new Division();

    public Calculator(){
        new Input(this);
        new Calculation(this);
        new Output(this);
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
