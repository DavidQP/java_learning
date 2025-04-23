package codewars_challenges;

public class ExclamationMarkSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println(replaced("Hello World!"));
		System.out.println(replacedV2("Hello World!"));
	}
	
	public static String replaced(final String s) {
		String replaced = s.replaceAll("[aeiouAEIOU]", "!");
		return replaced;
	}
	
	public static String replacedV2(final String s) {
		return s.replaceAll("(?i)[aeiou]", "!");
	}

}
