import java.util.LinkedList;
import java.util.regex.Pattern;

public class Calculator {
    private final String input;
    private final LinkedList<Integer> operands;
    private final LinkedList<String> operators;

    public Calculator(String input) {
        this.input = input;
        this.operands = new LinkedList<>();
        this.operators = new LinkedList<>();
    }

    public int calculate() {
        String[] elements = input.split(" ");
        for (String element : elements) {
            if (Operator.isOperator(element)) {
                operators.addLast(element);
            }
            else if(validateOperand(element)) {
                operands.addLast(Integer.parseInt(element));
            }
        }
        return subCalculate();
    }

    public int subCalculate() {
        while(!operators.isEmpty()) {
            String operator = operators.removeFirst();
            int num1 = operands.removeFirst();
            int num2 = operands.removeFirst();

            Operator op = Operator.getOperator(operator);
            int result = op.calculate(num1, num2);
            operands.addFirst(result);
        }
        return operands.element();
    }

    public boolean validateOperand(String element) {
        if(!Pattern.compile("^[0-9]+$")
                .matcher(element)
                .matches()) {
            throw new RuntimeException("유효하지 않은 수입니다.");
        }
        return true;
    }
}
