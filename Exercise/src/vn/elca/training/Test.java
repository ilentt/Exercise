package vn.elca.training;

public class Test {
	public static void main(String[] args) {
		for (int i = 0; i < 6; i++) {
			for (int k = 0; k < 6 - i; k++) {
				System.out.print(" ");
			}
			for (int j = 0; j < i * 2 + 1; j++) {
				System.out.print(j);
			}
			System.out.println("");
		}
	}
}
