package viewer;

import java.util.Scanner;

public class InputView {
    private static final Scanner scanner = new Scanner(System.in);

    public static String init() {
        System.out.print("식을 입력해주세요 : ");
        final String formula = scanner.nextLine();
        scanner.close();
        return formula;
    }
}