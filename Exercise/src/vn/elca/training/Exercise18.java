package vn.elca.training;

public class Exercise18 {
	final int MAX_VALUE = 100;
	
	public static final int MAX_AGE = 100;
	public final static int MAX_SCORE = 10;
	public final int MAX_LEVEL = 999;
	
	public static final int MAX_HEIGHT; 
	
	public static int a = 100; 
	
	int myVariable;
	
	static {
		a = 900;
		MAX_HEIGHT = 100;
	}
	
	public void myMethod(final int a) {
		System.out.println(a);
	}
	
	public void runApp() {
		System.out.println(MAX_AGE);
		System.out.println(MAX_SCORE);
	}
	
	public void function1() {
		// to
		function2();
	}
	
	public static void function2() {
		Exercise18 e = new Exercise18();
		e.function1();
		e.myVariable = 3;
		
		
	}
	
	public static void main(String[] args) {
		Exercise18 e = new Exercise18();
		e.runApp();
		e.myMethod(1000);
		e.myMethod(99999);
		System.out.println(a);
		
		System.out.println(MAX_AGE);
		System.out.println(MAX_SCORE);
		System.out.println(e.MAX_LEVEL);
	}
}

class myClass {
	public static final int A = 100;
	public final int B = 200;
}