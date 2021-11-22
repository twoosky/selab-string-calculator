package Test;

import java.util.Scanner;

public class Inputs {
    public static String[] getLine(Scanner scan){
        System.out.print("수식 : ");
        String value = scan.nextLine();
        String[] values = value.split(" ");
        return values;
    }
}
