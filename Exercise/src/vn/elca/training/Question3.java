package vn.elca.training;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Vector;

public class Question3 {
	public static void main(String[] args) {
		Map<String, Integer> carPrices = new HashMap<String, Integer>();
		carPrices.put("BMW", 70000);
		carPrices.put("Kia-Forte", 29000);
		carPrices.put("Toyota-Camry", 60000);
		carPrices.put("Lexus", 90000);
		carPrices.put("Honda-Civic", 31000);
		carPrices.put("Audi", 90000);

		List<String> sortedCarBrands = new Vector<String>();
		sortedCarBrands.addAll(carPrices.keySet());
		
		//sortedCarBrands.addAll(carPrices.entrySet());
		//List<String> sortedCarBrands = new ArrayList<String>();
		
		/*sortedCarBrands.add("BMW")O;
		sortedCarBrands.add("Kia-Forte");
		sortedCarBrands.add("Camry");
		sortedCarBrands.add("Audi");*/

		System.out.println("Before sorted\n");
		for (String car : sortedCarBrands) {
			System.out.println(car);
		}

		Collections.sort(sortedCarBrands);
		
		System.out.println("\nAfter sorted\n");
		for (String car : sortedCarBrands) {
			System.out.println(car);
		}
		
		System.out.println("\nReverse order\n");
		Collections.reverse(sortedCarBrands);
		for(String car : sortedCarBrands) {
			System.out.println(car);
		}
	}
}
