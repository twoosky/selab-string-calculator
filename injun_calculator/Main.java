package Calculate;
	

public class Main {
	public static void main(String[] args) {
		Numbers nums = new Numbers();
		Operators opers = new Operators();
		
		String word = Input.input();
		
		new Separation(word,nums,opers);
		new Calculate(nums,opers);
		
	}

}
