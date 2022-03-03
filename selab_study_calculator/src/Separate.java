package Calculate;

public class Separate {
	Numbers numbers = new Numbers();
	Operators operators = new Operators();
	
	protected Separate(String word) {
		stringSepartion(word);
		new Calculate(numbers,operators);
	}

	protected void stringSepartion(String word) {
		String section[] = split(word);
		for(int i=0;i<section.length;i++) {
			if(i%2==0) {
				Number number = new Number(section[i]);
				numbers.setNumbers(number.getNumber());
			}
			if(i%2==1) {
				Operator operator = new Operator(section[i]);
				operators.setOperators(operator.getOperator());
			}
		}
	}
	
	private String[] split(String str) {
		return str.split("\\s");
	}
}
