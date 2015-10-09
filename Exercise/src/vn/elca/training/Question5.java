package vn.elca.training;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Question5 {
	public static void main(String[] args) {
		Map<String, Integer> carPrices = new HashMap<String, Integer>();
		carPrices.put("BMW", 70000);
		carPrices.put("Kia-Forte", 29000);
		carPrices.put("Toyota-Camry", 60000);
		carPrices.put("Lexus", 90000);
		carPrices.put("Honda-Civic", 31000);
		carPrices.put("Audi", 90000);

		
		System.out.println("Sort by value: Befor sort\n");
		
		for (Map.Entry<String, Integer> carPrice : carPrices.entrySet()) {
			System.out.println(carPrice.getKey() + " : " + carPrice.getValue());
		}
		
		// Question 5: sort by price(value)
		System.out.println("\nSort by value: After sort\n");
		Map<String, Integer> sortedCarBrands = sortByValue(carPrices);
		for (Map.Entry<String, Integer> carPrice : sortedCarBrands.entrySet()) {
			System.out.println(carPrice.getKey() + " : " + carPrice.getValue());
		}
		
		// Question 6: reverse sorted map
		System.out.println("\nSort by value: After reverse order\n");
		Map<String, Integer> carPriceReverse = sortByValue(carPrices);
		
		List<Map.Entry<String, Integer>> list = new ArrayList<Map.Entry<String, Integer>>(carPriceReverse.entrySet());
		Collections.reverse(list);
		for (Map.Entry<String, Integer> carPrice : list) {
			System.out.println(carPrice.getKey() + " : " + carPrice.getValue());
		}
		
	}
	
	public static Map<String, Integer> sortByValue(Map<String, Integer> carPrices) {
		List<Map.Entry<String, Integer>> list = new LinkedList<Map.Entry<String, Integer>>(carPrices.entrySet());
		Collections.sort(list, new Comparator<Map.Entry<String, Integer>>(){
			public int compare(Map.Entry<String, Integer> obj1, Map.Entry<String, Integer> obj2) {
				return (obj1.getValue().compareTo(obj2.getValue()));
			}
		});
		
		// convert sorted map back to a map
		Map<String, Integer> sortedCarBrands = new LinkedHashMap<String, Integer>();
		for(Iterator<Map.Entry<String, Integer>> it = list.iterator(); it.hasNext();) {
			Map.Entry<String, Integer> entry = it.next();
			sortedCarBrands.put(entry.getKey(), entry.getValue());
		}
		
		return sortedCarBrands;
	}
}
 