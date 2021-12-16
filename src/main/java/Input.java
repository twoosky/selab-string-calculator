import java.util.*;

public class Input {

  private final static Scanner scanner = new Scanner(System.in);
  private final static String REGEX = " ";

  protected List<String> scanLine() {
    System.out.println("식을 입력해주세요");
    List<String> InputSplit = Arrays.asList(scanner.nextLine().split(REGEX));
    return new ArrayList<>(InputSplit);
  }
}
