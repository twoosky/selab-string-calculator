import java.util.LinkedList;
import java.util.regex.Pattern;

public class Calculator {
    private final String input;

    public Calculator(String input) {
        this.input = input;
    }

    public int calculate() {
        String[] elements = input.split(" ");
        Operand operand = new Operand();
        for (String element : elements) {
            if (Operator.isOperator(element)) {
                Operator.insertLast(element);
            }
            else if(operand.validateOperand(element)) {
                operand.insertLast(Integer.parseInt(element));
            }
        }
        return subCalculate(operand);
    }

    public int subCalculate(Operand operand) {
        while(!Operator.isEmpty()) {
            String operator = Operator.getOperator();
            int num1 = operand.getOperand();
            int num2 = operand.getOperand();

            Operator op = Operator.getInstance(operator);
            int result = op.calculate(num1, num2);
            operand.insertFirst(result);
        }
        return operand.getOperand();
    }
}
