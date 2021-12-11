import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Numbers {

  private final List<Integer> Numbers = new ArrayList<>();

  public int getNumbers(int index) {
    return Numbers.get(index);
  }

  public Numbers(List<String> inputs) {
    Stream<String> numberStream = inputs.stream();
    numberStream.filter(input -> input.matches("[0-9]"))
        .forEach(this::setNumbers);
  }

  public void setNumbers(String number) {
    Numbers.add(mapToInt(number));
  }

  private int mapToInt(String number) {
    return Integer.parseInt(number);
  }
  public void finishedCalculateNumber (int result) {
    if (!Numbers.isEmpty()) {
      Numbers.remove(0);
      Numbers.remove(1);
      Numbers.add(0,result);
    }
  }
}
