package calculatorIO;

import calculator.Calculator;
import calculator.Operator;
import calculator.Number;

import java.util.Scanner;

public class Input {
    private final String INPUT_MESSAGE = "식을 입력해주세요 : ";
    private final Scanner SCANNER = new Scanner(System.in);
    private final String separator = " ";

    public Input(Calculator calculator){
        printInputMessage();
        calculator.setFormula(setData());
        String[] splitedFormula = split(calculator.getFormula());
        addData(calculator, splitedFormula);
    }

    private void addData(Calculator calculator, String[] data){
        for(int i = 0; i < data.length; i++){
            if(i % 2 == 0){
                new Number(calculator, data[i]);
            }
            if(i % 2 == 1){
                new Operator(calculator, data[i]);
            }
        }
    }

    private void printInputMessage(){
        System.out.print(INPUT_MESSAGE);
    }

    private String setData(){
        return SCANNER.nextLine();
    }

    private String[] split(String formula){
        return formula.split(separator);
    }
}
