package Calculate;

import java.util.ArrayList;
import java.util.List;

public class Operators {
	private List<String> opers = new ArrayList<>();
	
	protected void setOperators(String oper) {
		this.opers.add(oper);
	}
	
	protected List getOperators() {
		return opers;
	}
}
