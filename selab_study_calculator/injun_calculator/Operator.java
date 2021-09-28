package Calculate;

public class Operator {
	private String oper;
	
	protected Operator() {
		
	}
	
	protected Operator(String oper, Operators opers){
		valiation_Operator(oper);
		opers.setOperators(oper);
	}

	protected void setOperator(String oper) {
		this.oper = oper;
	}
	
	protected String getOperator() {
		return this.oper;
	}

	private void valiation_Operator(String word) {	
		boolean OperatorOrNot = word.matches("[*+-]");	
		if(!OperatorOrNot) {
			runtimeException("잘못된 연산자입니다");
		}
		if(word.length()!=1) {
			runtimeException("Char 형이 아닙니다");
		}
		
	}
	
	private void runtimeException(String str) {
		throw new RuntimeException(str);
	}
	
	
}
