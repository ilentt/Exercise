package vn.elca.training;

import java.util.HashMap;
import java.util.Map;

public class Question2 {
	public void runApp() {
		Map<String, Long> carPrices = new HashMap<String, Long>();
		carPrices.put("BMW", (long) 70000);
		carPrices.put("Kia-Forte", (long) 29000);
		for(String key : carPrices.keySet()) {
			System.out.println(key + " : " + carPrices.get(key));
		}
	}
	
	public static void main(String[] args) {
		Question2 q2 = new Question2();
		q2.runApp();
	}
}
