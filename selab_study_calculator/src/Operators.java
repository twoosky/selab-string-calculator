package Calculate;

import java.util.ArrayList;
import java.util.List;

public class Operators {
	private List<String> operators = new ArrayList<>();
	
	protected void setOperators(String operator) {
		this.operators.add(operator);
	}
	
	protected List<String> getOperators() {
		return operators;
	}
}
