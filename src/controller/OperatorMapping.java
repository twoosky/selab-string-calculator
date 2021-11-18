package controller;

import model.Operator;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
public class OperatorMapping {
    private static final Map<String, Operator> operatorMap = new HashMap<>();

    static {
        operatorMap.put("+", Operator.PLUS);
        operatorMap.put("-", Operator.MINUS);
        operatorMap.put("*", Operator.MULTIPLY);
        operatorMap.put("/", Operator.DIVIDE);
    }

    public  Integer calculate(Integer a, String operator, Integer b) {
        return Optional.ofNullable(operatorMap.get(operator))
                .orElseThrow(() -> new IllegalArgumentException("잘못된 연산자 입력입니다."))
                .mapCalculate(a, b);
    }
}
