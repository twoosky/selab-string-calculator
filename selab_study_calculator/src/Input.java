package Calculate;

import java.util.Scanner;

public class Input {
	private static final Scanner scan = new Scanner(System.in);

	public static String input() {
		System.out.println("Input : ");
		return scan.nextLine();
	}
}
