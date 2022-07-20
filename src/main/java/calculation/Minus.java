package calculation;

public class Minus implements Calculate{

    private final String SIGN = "-";

    @Override
    public int doCalculate(int number1, int number2) {
        return number1 - number2;
    }

    @Override
    public String getSign() {
        return SIGN;
    }
}
