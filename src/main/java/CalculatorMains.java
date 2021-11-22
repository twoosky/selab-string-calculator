package Test;

import Calculator.Calculator;
import Calculator.Input;
import Calculator.Output;

import java.util.Scanner;

public class CalculatorMains {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] values = Input.getLine(scan);
        Output.print(Calculator.Calculate(values));
    }
}
