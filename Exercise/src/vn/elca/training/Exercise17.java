package vn.elca.training;

public class Exercise17 {

	/**
	 * @param myString
	 */
	public Exercise17(String myString) {
		System.out.println(myString);
	}

	public static void main(String[] args) {
		/*
		 * ArrayList<Exercise17> myObject = new ArrayList<Exercise17>();
		 * 
		 * for(Exercise17 e : myObject) { System.out.println(e); }
		 */

		//Exercise17[] excercise = { new Exercise17("string 1"), new Exercise17("string 2") };
		Exercise17[] excercise = {};
		for(Exercise17 e : excercise){
			System.out.println(e);
		}
	}
}
