import java.util.Scanner;

public class Input {
    public static String input(){

        Scanner scanner = new Scanner(System.in);

        System.out.println("입력하세요");

        return scanner.nextLine();
    }

}
