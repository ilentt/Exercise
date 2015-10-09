package vn.elca.training;

import java.util.HashMap;
import java.util.Map;

public class Question4 {
	
	public static void main(String[] args) {
		Map<String, Long> carPrices = new HashMap<String, Long>();
		carPrices.put("BMW", (long) 70000);
		carPrices.put("Kia-Forte", (long) 29000);
		carPrices.put("Camry", (long) 9666);
		carPrices.put("Audi", (long) 9886);
		
		String priceOfAllCar = "";
		StringBuilder stringBuider = new StringBuilder();
		for(Map.Entry<String, Long> carPrice : carPrices.entrySet()){
			String str = "["+carPrice.getKey() +" ("+ carPrice.getValue()+")] ";
			stringBuider.append(str);
		}
		priceOfAllCar = stringBuider.toString();
		System.out.println(priceOfAllCar);
	}
}
