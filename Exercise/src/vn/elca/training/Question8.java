package vn.elca.training;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Question8 {
	public static void main(String[] args) {
		List<String> listString = new ArrayList<String>();
		listString.add("Monday");
		listString.add("Tuesday");
		listString.add("Wednesday");
		
		// iterator via for loop
		System.out.println("Iterator via for loop");
		for(int i = 0; i < listString.size(); i++) {
			System.out.println(listString.get(i));
		}
		
		// iterator via for each loop
		System.out.println("\nIterator via for each loop");
		for(String lst : listString) {
			System.out.println(lst);
		}
		
		// iterator via while loop
		System.out.println("\nIterator via while loop");
		int i = 0;
		while(i < listString.size()) {
			System.out.println(listString.get(i));
			i++;
		}
		
		// iterator via iterator loop
		System.out.println("\nIterator via iterator loop");
		Iterator<String> iteratorString = listString.iterator();
		while(iteratorString.hasNext()) {
			System.out.println(iteratorString.next());
		}
		
		// iterator via ListIterator loop
		System.out.println("\nIterator via ListIterator loop");
		ListIterator<String> listIteratorString = listString.listIterator();
		while(listIteratorString.hasNext()) {
			System.out.println(listIteratorString.next());
		}
	}
}
