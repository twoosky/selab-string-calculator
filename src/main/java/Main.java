public class Main {
    public static void main(String[] args) {
        String input = InputUtil.getInput();
        Calculator calculator = new Calculator(input);

        int result = calculator.calculate();
        OutputUtil.getOutput(result);
    }
}
