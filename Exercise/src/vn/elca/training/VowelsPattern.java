package vn.elca.training;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class VowelsPattern {

	public static boolean sameVowelPatternOfLongWord(String s1, String s2) throws InvalidInputException {
		boolean flag = false;
		Pattern pattern = Pattern.compile("[aeiou]",Pattern.CASE_INSENSITIVE);
		Matcher matcher1 = pattern.matcher(s1);
		Matcher matcher2 = pattern.matcher(s2);
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
		
		if (str1.equals(str2))
			flag = true;
				
		return flag;
	}
	public static void main(String[] args) {
		try {
			System.out.println(sameVowelPatternOfLongWord("TRABAIGRAN", "JAMACICA"));
		} catch (InvalidInputException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}
}
