package Operators;

public class Divide implements Operators {

  @Override
  public int calculate(int frontNumber, int behindNumber) {
    return frontNumber / behindNumber;
  }
}
