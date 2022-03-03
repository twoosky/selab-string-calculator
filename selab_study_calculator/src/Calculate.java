package Calculate;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;

public class Calculate {
	private static Map<String, BiFunction<Integer, Integer, Integer>> operators = new HashMap<>();
	private List<Integer> numbers;
	private List<String> opers;
	
	 
	protected Calculate(Numbers numbers,Operators operators) {
		setCalculator(numbers,operators);
		calculate();
		Output.print("계산된 결과는 "+this.numbers.get(this.numbers.size()-1) + "입니다");
	}
	
	 static {
         operators.put("+", (num1, num2) -> num1 + num2);
         operators.put("-", (num1, num2) -> num1 - num2);
         operators.put("*", (num1, num2) -> num1 * num2);
     }

     public static int calculate(String operator, int num1, int num2) {
         return operators.get(operator).apply(num1, num2);
     }
	
	
	private void setCalculator(Numbers numbers,Operators opers) {
		this.opers =  opers.getOperators();
		this.numbers = numbers.getNumbers();
	}
	
	private void calculate() {
		int result = numbers.get(0);
		for(int i=0; i<opers.size();i++) {
			result = calculate(opers.get(i),result, numbers.get(i+1));
			numbers.set(i+1, result);
		}
	}
     
}
