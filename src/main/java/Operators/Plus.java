package Operators;

public class Plus implements Operators {

  @Override
  public int calculate(int frontNumber, int behindNumber) {
    return frontNumber + behindNumber;
  }
}

