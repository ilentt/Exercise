package vn.elca.training;

public class Alias1 {
	int i;
	
	public Alias1(int ii) {
		// TODO Auto-generated constructor stub
		i = ii;
	}
	
	public static void main(String[] args) {
		Alias1 x = new Alias1(7);
		Alias1 y = x;
		System.out.println("x: " + x.i);
		System.out.println("y: " + y.i);
		System.out.println("Incrementing x");
		x.i++;
		System.out.println("x: " + x.i);
		System.out.println("y: " + y.i);
	}
}
