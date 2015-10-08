package vn.elca.training;

import java.util.Arrays;
import java.util.List;

public class Question1 {
	public static void main(String[] args) {
		String carBrand = "BMV Kia-Forte Toyota-Camry Lexus Honda-Civic Audi";
		String[] carArray = carBrand.split(" ");
		List<String> carList = Arrays.asList(carArray);
		for(String car : carList) {
			System.out.println(car);
		}
	}
}
