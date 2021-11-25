package calculator;

import java.util.LinkedList;
import java.util.Queue;

public class Calculator {
    public int result;

    public Queue<Number> number = new LinkedList<>();
    public Queue<Operator> operator = new LinkedList<>();

    public Calculator(){

    }
}
