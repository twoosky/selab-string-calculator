public class Main {

  private static final int INIT_RANGE = 0;

  public static void main(String[] args) {

    Input input = new Input();
    Calculator calculator = new Calculator();

    System.out.println(calculator.isProgressing(input.scanLine(), INIT_RANGE));
  }
}