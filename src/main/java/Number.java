import java.util.List;

public class Number {

  private List<Integer> number;

  public Number(String value) {
    numberVerification(value);
    number.add(mapToInt(value));
  }

  public List getNumber(List<Integer> number) {
    return this.number = number;
  }

  public static void numberVerification(String number) {
    if (!number.equals("^[0-9]+$")) {
      throw new IllegalArgumentException("숫자가 아닙니다!");
    }
  }

  public static int mapToInt(String number) {
    return Integer.parseInt(number);
  }

}

  
