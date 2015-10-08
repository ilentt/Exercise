package vn.elca.training;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class VowelsPattern {

	public static void main(String[] args) {
		Pattern pattern = Pattern.compile("[aeiou]",Pattern.CASE_INSENSITIVE);
		String string1 = "HANEMO";
		String string2 = "TENAMO";

		Matcher matcher1 = pattern.matcher(string1);
		Matcher matcher2 = pattern.matcher(string2);
		/*
		 * if(matcher.matches()) { System.out.println(matcher.group(1)); }
		 */
		String str1 = "";
		while (matcher1.find()) {
			str1 += matcher1.group();
		}
		
		System.out.println(str1);
		
		String str2 = "";
		while (matcher2.find()) {
			str2 += matcher2.group();
		}
		
		System.out.println(str2);
		
		
		if (str1.equals(str2)) {
			System.out.println(true);
		} else
			System.out.println(false);
		
	}
}
