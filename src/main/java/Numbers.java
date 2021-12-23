import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Numbers {

  private final List<Integer> Numbers = new ArrayList<>();

  public Numbers(List<String> inputs) {
    Stream<String> numberStream = inputs.stream();
    numberStream.filter(input -> input.matches(Number.ONLY_NUMBER_REGEX))
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
      Numbers.remove(Number.BEHIND_NUMBER);
      Numbers.remove(Number.FRONT_NUMBER);
      Numbers.add(Number.FRONT_NUMBER, result);
    }
  }

  public int getSize() {
    return Numbers.size();
  }
}
