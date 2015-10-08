package vn.elca.training;

public class Exercise15 {
	private String myString;
	
	/**
	 * @param myString
	 */
	public Exercise15(String myString) {
		this.myString = myString;
	}

	public static void main(String[] args) {
		Exercise15 e = new Exercise15("Exercise 15");
		
		System.out.println(e.myString);
	}
}
