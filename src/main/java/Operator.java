import java.util.Arrays;
import java.util.LinkedList;
import java.util.function.BiFunction;

public enum Operator {
    PLUS("+", (num1, num2) -> num1 + num2),
    MINUS("-", (num1, num2) -> num1 - num2),
    MULTIPLY("*", (num1, num2) -> num1 * num2),
    DIVIDE("/", (num1, num2) -> num1 / num2),
    ;

    private final String operator;
    private final Expression<Integer> expression;

    Operator(String operator, Expression<Integer> expression) {
        this.operator = operator;
        this.expression = expression;
    }

    public int calculate(int num1, int num2) {
        return expression.apply(num1, num2);
    }

    public static Operator getInstance(String operator) {
        return Arrays.stream(Operator.values())
                .filter(op -> op.operator.equals(operator))
                .findFirst()
                .orElseThrow(() -> new RuntimeException("유효하지 않은 연산자입니다."));
    }

    public static int getResult(LinkedList<String> operators, int num1, int num2) {
        String operator = getOperator(operators);
        int result = getInstance(operator).calculate(num1, num2);
        return result;
    }

    public static void insertLast(LinkedList<String> operators, String element) {
        operators.addLast(element);
    }

    public static String getOperator(LinkedList<String> operators) {
        return operators.removeFirst();
    }

    public static Boolean isEmpty(LinkedList<String> operators) {
        return operators.isEmpty();
    }
}
