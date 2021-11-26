package calculatorIO;

import calculator.Calculator;

import java.util.Scanner;

public class Input {
    private final String INPUT_MESSAGE = "식을 입력해주세요 : ";
    private final Scanner SCANNER = new Scanner(System.in);
    private final String separator = " ";

    public Input(Calculator calculator){
        calculator.setFormula(getData());
        String[] splitedFormula = split(calculator.getFormula());

    }

    private void printInputMessage(){
        System.out.print(INPUT_MESSAGE);
    }

    private String getData(){
        printInputMessage();
        return SCANNER.nextLine();
    }

    private String[] split(String formula){
        return formula.split(separator);
    }
}
