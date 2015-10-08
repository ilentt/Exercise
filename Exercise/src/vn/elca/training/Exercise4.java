package vn.elca.training;

public abstract class Exercise4 {
	protected String string1;
	protected String string2;
	private String string3;
	protected abstract void showApp();
	protected void showApp2() {
		System.out.println("This is app 2 " + string1 + " " + string2 );
	}
	public void showApp3() {
		System.out.println("This is app 3 : set public");
	}
	
	public void showApp4() {
		string3 = "This is private field";
		System.out.println("This is app 4: set private field" + string3);
	}
	
}
