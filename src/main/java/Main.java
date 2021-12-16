public class Main {

  private static final int INIT_RANGE = 0;

  public static void main(String[] args) {

    Input input = new Input();
    Output output = new Output();
    Calculator calculator = new Calculator();
    int result = calculator.isProgressing(input.scanLine(), INIT_RANGE);
    output.printResult(result);
  }
}