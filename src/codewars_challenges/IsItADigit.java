package codewars_challenges;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class IsItADigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(IsItADigit.isDigit("5"));;
		System.out.println(IsItADigit.isDigit(""));
		System.out.println(IsItADigit.isDigit(" "));
		System.out.println(IsItADigit.isDigit("10a"));
		System.out.println(IsItADigit.isDigit("a10"));
	}
	
	// Link here: https://www.codewars.com/kata/567bf4f7ee34510f69000032/java
	public static boolean isDigit(String s) {
		// First way
		//Pattern regex = Pattern.compile("\\d");
		//Matcher verify = regex.matcher(s);
		
		// Second way
		return s.matches("\\d");
	}

}
