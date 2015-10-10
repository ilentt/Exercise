package vn.elca.training;

import java.util.Map;
import java.util.TreeMap;

public class Question7 {
	public static void main(String[] args) {
		Map<String, Integer> carPrices = new TreeMap<String, Integer>();
		//Map<String, Integer> carPrices = new TreeMap<String, Integer>();
		carPrices.put("Kia-Forte", 29000);
		carPrices.put("BMW", 70000);
		carPrices.put("Camry", 9666);
		carPrices.put("Audi", 9886);
		
		for (Map.Entry<String, Integer> carPrice : carPrices.entrySet()) {
			System.out.println("["+carPrice.getKey() + " : " + carPrice.getValue()+"]");
		}
		
	}
}
