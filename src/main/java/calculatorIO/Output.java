package calculatorIO;

import calculator.Calculator;

public class Output {
    private final String OUTPUT_MESSAGE = "계산 결과 : ";

    public Output(Calculator calculator){
        printOutputMessage();
        System.out.println(calculator.getResult());
    }

    public void printOutputMessage(){
        System.out.print("\n" + OUTPUT_MESSAGE);
    }
}
