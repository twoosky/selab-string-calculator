package Operators;

public class Minus implements Operators {

  @Override
  public int calculate(int frontNumber, int behindNumber) {
    return frontNumber - behindNumber;
  }
}
