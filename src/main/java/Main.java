public class Main {
    public static void main(String[] args) {
        String input = InputUtil.getInput();
        Calculator calculator = new Calculator(input);

        Integer result = calculator.calculate();
        System.out.println(result);
    }
}
