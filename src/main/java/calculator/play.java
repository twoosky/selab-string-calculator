package calculator;

import calculatorIO.Input;

public class play {
    public static void main (String[] args){
        Calculator calculator = new Calculator();
        Input input = new Input(calculator);

        System.out.print(calculator.formula);
    }
}
