package week2.day1;

public class LearnString {
		public static void main(String[]args) {
	String text="testleaf";
		int num=0;
		for(int i=0; i<text.length(); i++) {
			if(text.charAt(i)=='e')
				num++;
		}
		System.out.println("Number of e:" +num);
	}
		
		
	}


