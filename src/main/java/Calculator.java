import java.util.LinkedList;
import java.util.regex.Pattern;

public class Calculator {
    private final String input;
    private final LinkedList<String> operators;

    public Calculator(String input) {
        this.input = input;
        this.operators = new LinkedList<>();
    }

    public int calculate() {
        String[] elements = input.split(" ");
        Operand operand = new Operand();
        for (String element : elements) {
            insertElement(operand, element);
        }
        return subCalculate(operand);
    }

    public void insertElement(Operand operand, String element) {
        if(operand.validateOperand(element)) {
            operand.insertLast(Integer.parseInt(element));
            return;
        }
        Operator.insertLast(operators, element);
    }

    public int subCalculate(Operand operand) {
        while(!Operator.isEmpty(operators)) {
            int num1 = operand.getOperand();
            int num2 = operand.getOperand();

            int result = Operator.getResult(operators, num1, num2);
            operand.insertFirst(result);
        }
        return operand.getOperand();
    }
}
