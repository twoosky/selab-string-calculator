package Calculate;


public class Number {
	private int num;
	
	protected Number(String num) {	
		valiationNum(num);
		this.num = Conversion(num);
	}
	
	protected int getNumber() {
		return this.num;
	}

	private void valiationNum(String word) {	
		if(!(word.matches("-?\\d+"))) {
			throw new RuntimeException("잘못된 정수");
		}
	}
	
	private int Conversion(String str) {
		return Integer.parseInt(str);
	}
	
}
