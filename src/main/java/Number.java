
public class Number {

  public final static String NUMBER_REGEX = "^[0-9]+$";
  public final static int FRONT_NUMBER = 0;
  public final static int BEHIND_NUMBER = 1;

  private final int number;

  public Number(String number) {
    numberVerification(number);
    this.number = mapToInt(number);
  }

  private void numberVerification(String number) {
    if (!number.equals(NUMBER_REGEX)) {
      throw new IllegalArgumentException("숫자가 아닙니다!");
    }
  }

  public int mapToInt(String number) {
    return Integer.parseInt(number);
  }


}

  
