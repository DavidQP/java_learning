package BlissWar;

public class CamelCase {
	public static String stringToCamelCase(String word) {
		String[] example = word.split("");
		String result = "";
		for(int index = 0; index < example.length; index++) {
			result += (index % 2 == 0) ? example[index] : example[index].toUpperCase();
		}
		return result;
	}
}
