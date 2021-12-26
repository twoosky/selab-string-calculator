public class Main {

  public static void main(String[] args) {
    Input input = new Input();
    Output output = new Output();
    Calculator calculator = new Calculator();
    int result = calculator.isProgressing(input.scanLine());
    output.printResult(result);
  }
}