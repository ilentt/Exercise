package vn.elca.training;

import java.util.HashMap;
import java.util.Map;

public class Question4 {
	
	public static void main(String[] args) {
		Map<String, Integer> carPrices = new HashMap<String, Integer>();
		carPrices.put("BMW", 70000);
		carPrices.put("Kia-Forte", 29000);
		carPrices.put("Toyota-Camry", 60000);
		carPrices.put("Lexus", 90000);
		carPrices.put("Honda-Civic", 31000);
		carPrices.put("Audi", 90000);
		
		//String priceOfAllCar = "";
		StringBuilder priceOfAllCar = new StringBuilder();
		for(Map.Entry<String, Integer> carPrice : carPrices.entrySet()){
			String str = "["+carPrice.getKey() +" ("+ carPrice.getValue()+")] ";
			priceOfAllCar.append(str);
		}
		//priceOfAllCar = stringBuider.toString();
		System.out.println(priceOfAllCar);
	}
}
