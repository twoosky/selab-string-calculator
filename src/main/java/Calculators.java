package Test;

public class Calculators {
    public static int Calculate(String[] values) {
        int firstNumber = Integer.parseInt(values[0]);
        int result = firstNumber;

        for (int i = 1; i < values.length; i += 2) {
            int secondNumber = Integer.parseInt(values[i + 1]);
            String symbol = values[i];
            if (symbol.equals("+")) {
                Plus plus = new Plus();
                plus.setNumber(result, secondNumber);
                plus.cal();
            } else if (symbol.equals("-")) {
                Minus minus = new Minus();
                minus.setNumber(result, secondNumber);
                minus.cal();
            } else if (symbol.equals("*")) {
                Multiply multiply = new Multiply();
                multiply.setNumber(result, secondNumber);
                multiply.cal();
            } else if (symbol.equals("/")) {
                Division division = new Division();
                division.setNumber(result, secondNumber);
                division.cal();
            } else {
                System.out.print("연산자가 이상합니다.");
            }
        }
        return result;
    }
}

