package vn.elca.training;

import java.util.HashMap;
import java.util.Map;

public class Question2 {
	public void runApp() {
		Map<String, Integer> carPrices = new HashMap<String, Integer>();
		carPrices.put("BMW", 70000);
		carPrices.put("Kia-Forte", 29000);
		carPrices.put("Toyota-Camry", 60000);
		carPrices.put("Lexus", 90000);
		carPrices.put("Honda-Civic", 31000);
		carPrices.put("Audi", 90000);
		
		for (Map.Entry<String, Integer> carPrice : carPrices.entrySet()) {
			System.out.println(carPrice.getKey() + " : " + carPrice.getValue());
		}
	}
	
	public static void main(String[] args) {
		Question2 q2 = new Question2();
		q2.runApp();
	}
}
