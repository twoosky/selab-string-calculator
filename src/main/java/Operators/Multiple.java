package Operators;

public class Multiple implements Operators {

  @Override
  public int calculate(int frontNumber, int behindNumber) {
    return frontNumber * behindNumber;
  }
}
