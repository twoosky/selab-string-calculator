import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Numbers {

  private final List<Integer> Numbers = new ArrayList<>();
  private final static String ONLY_NUMBER_REGEX = "^[0-9]+$";
  public final static int FRONT_NUMBER = 0;
  public final static int BEHIND_NUMBER = 1;

  public Numbers(List<String> inputs) {
    Stream<String> numberStream = inputs.stream();
    numberStream.filter(input -> input.matches(ONLY_NUMBER_REGEX))
        .forEach(this::setNumbers);
  }

  public int getNumbers(int index) {
    return Numbers.get(index);
  }

  public void setNumbers(String number) {
    Numbers.add(mapToInt(number));
  }

  private int mapToInt(String number) {
    return Integer.parseInt(number);
  }

  public void removeAndAddNumber(int result) {
    if (!Numbers.isEmpty()) {
      Numbers.remove(BEHIND_NUMBER);
      Numbers.remove(FRONT_NUMBER);
      Numbers.add(FRONT_NUMBER, result);
    }
  }

  public int getSize() {
    return Numbers.size();
  }
}
