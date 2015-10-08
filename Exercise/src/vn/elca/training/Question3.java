package vn.elca.training;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Question3 {
	public static void main(String[] args) {
		Map<String, Long> carPrices = new HashMap<String, Long>();
		carPrices.put("BMW", (long) 70000);
		carPrices.put("Kia-Forte", (long) 29000);
		carPrices.put("Camry", (long) 9666);
		carPrices.put("Audi", (long) 9886);

		// List<String> sortedCarBrands = new Vector<String>();
		List<String> sortedCarBrands = new ArrayList<String>();
		// sortedCarBrands.addAll(carPrices.keySet());
		sortedCarBrands.add("BMW");
		sortedCarBrands.add("Kia-Forte");
		sortedCarBrands.add("Camry");
		sortedCarBrands.add("Audi");

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
