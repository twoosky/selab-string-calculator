package Calculate;

public class Separation {

	protected Separation(String word, Numbers nums, Operators opers) {
		stringSepartion(word,nums,opers);
	}



	private void stringSepartion(String word, Numbers nums, Operators opers) {
		String section[] = split(word);
		for(int i=0;i<section.length;i++) {
			if(i%2==0) {
				new Number(section[i],nums);
			}
			if(i%2==1) {
				new Operator(section[i],opers);
			}
		}
	}
	
	private String[] split(String str) {
		String word[] = str.split("\\s");
		return word;
	}
	
}
