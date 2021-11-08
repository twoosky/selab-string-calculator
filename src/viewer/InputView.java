package viewer;

import java.util.Scanner;
public class InputView {
    Scanner scanner = new Scanner(System.in);
    String formula  ="";

    public String initFormula(){
        System.out.print("식을 입력해주세요 :  ");
        formula = scanner.nextLine();
        return formula;
    }

}

