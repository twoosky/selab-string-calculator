package calculatorIO;

import java.util.Scanner;

public class Input {
    private final String INPUT_MESSAGE = "식을 입력해주세요 : ";
    private final Scanner SCANNER = new Scanner(System.in);


    public Input(){

    }

    private String inputData(){
        System.out.print(INPUT_MESSAGE);
        return SCANNER.nextLine();
    }
}
