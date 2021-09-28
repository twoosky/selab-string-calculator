package Calculate;

import java.util.ArrayList;
import java.util.List;

public class Numbers {
	private List<Integer> numbers = new ArrayList<>();

	protected void setNumbers(int number) {
		this.numbers.add(number);
	}
	
	protected List getNumbers() {
		return numbers;
	}
	
}
