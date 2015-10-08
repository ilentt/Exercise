package vn.elca.training;

public class Exercise14 {
	
	static String String1 = "First String";
	
	static {
		String1 = "Second String";
		//String String2 = "Second String";
	}
	
	public static void main(String[] args) {
		System.out.println(String1);
		//System.out.println(String2);
	}
}
