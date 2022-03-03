import java.util.*;

public class Input {

  private final static Scanner scanner = new Scanner(System.in);
  private final static String REGEX = " ";

  protected List<String> getInput() {
    System.out.println("식을 입력해주세요");
    String[] InputData = scanner.nextLine().split(REGEX);
    return new ArrayList<>(Arrays.asList(InputData));
  }
}
