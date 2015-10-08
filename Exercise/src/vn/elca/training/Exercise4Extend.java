package vn.elca.training;

public class Exercise4Extend extends Exercise4 {

	public static void main(String[] args) {
		Exercise4Extend e = new Exercise4Extend();
		e.string1 = "Hello";
		e.string2 = "Exercise";
		e.showApp();
		e.showApp2();
		e.showApp3();
		e.showApp4();
	}

	@Override
	protected void showApp() {
		// TODO Auto-generated method stub
		System.out.println("This is app 1");
	}
}
