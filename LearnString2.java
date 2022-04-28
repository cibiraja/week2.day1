package week2.day1;

public class LearnString2 {
	public static void main(String[] args) {
		String input="Testleaf is situtated in twin towers teynampet";
		for(String value:input.split(" ")) {
			if(value.startsWith("T")||value.startsWith("t")) {
				System.out.println(value);
			}
		}
	}

}
