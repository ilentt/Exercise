package vn.elca.training;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Question3v2 {
	public static void main(String[] args) {
		Map<String, Integer> carPrices = new HashMap<String, Integer>();
		carPrices.put("BMW", 70000);
		carPrices.put("Kia-Forte", 29000);
		carPrices.put("Toyota-Camry", 60000);
		carPrices.put("Lexus", 90000);
		carPrices.put("Honda-Civic", 31000);
		carPrices.put("Audi", 90000);

		System.out.println("Sort by key: Befor sort\n");
		
		for (Map.Entry<String, Integer> carPrice : carPrices.entrySet()) {
			System.out.println(carPrice.getKey() + " : " + carPrice.getValue());
		}
		
		System.out.println("\nSort by key: After sort\n");
		Map<String, Integer> carPriceSorted = new TreeMap<String, Integer>(carPrices);
		for (Map.Entry<String, Integer> carPrice : carPriceSorted.entrySet()) {
			System.out.println(carPrice.getKey() + " : " + carPrice.getValue());
		}
	}
}
