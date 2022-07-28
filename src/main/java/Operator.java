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
    private static final LinkedList<String> operators = new LinkedList<>();

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

    public static boolean isOperator(String operator) {
        return Arrays.stream(Operator.values())
                .anyMatch(op -> op.operator.equals(operator));
    }

    public static void insertLast(String element) {
        operators.addLast(element);
    }

    public static String getOperator() {
        return operators.removeFirst();
    }

    public static Boolean isEmpty() {
        return operators.isEmpty();
    }
}
