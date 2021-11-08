package model;

import java.util.function.BiFunction;

public enum Operator {
    PLUS('+', (num1, num2) -> num1 + num2),
    MINUS('-', (num1, num2) -> num1 - num2),
    MULTIPLY('*', (num1, num2) -> num1 * num2),
    DIVIDE('/', (num1, num2) -> num1 / num2);

    private Character operator;
    private BiFunction<Integer,Integer,Integer> expression;

    Operator(Character operator, BiFunction<Integer,Integer,Integer> expression) {
        this.operator = operator;
        this.expression = expression;
    }

    public Integer mapCalculate(Integer num1, Integer num2) {
        return expression.apply(num1, num2);
    }
}
