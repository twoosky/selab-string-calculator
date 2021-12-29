import java.util.List;

public class Number {
  public final static String NUMBER_REGEX = "^[0-9]+$";
  public final static int FRONT_NUMBER = 0;
  public final static int BEHIND_NUMBER = 1;

  private final List<Integer> number;

  public Number(List<Integer> number) {
    this.number = number;
  }

  public boolean IsNumber (String number) {
    return number.matches(NUMBER_REGEX);
  }

  public int toInteger(String number) {
    return Integer.parseInt(number);
  }






}
