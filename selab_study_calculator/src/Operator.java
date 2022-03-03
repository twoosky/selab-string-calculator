package Calculate;

public class Operator {
	private String oper;
	
	protected Operator(String oper){
		valiationOperator(oper);
		setOperator(oper);
	}

	protected void setOperator(String oper) {
		this.oper = oper;
	}
	
	protected String getOperator() {
		return this.oper;
	}

	private void valiationOperator(String word) {	
		boolean OperatorOrNot = word.matches("[+*-]");	
		if(!OperatorOrNot) {
			throw new RuntimeException("잘못된 연산자입니다");
		}	
	}
	
	
}
