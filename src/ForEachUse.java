import static java.lang.Math.random;

public class ForEachUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printCountries();
		printRandomNumbers();
	}
	
	public static void printRandomNumbers() {
		int[] randomNumbers = new int[150];
		
		for(int index = 0; index < randomNumbers.length; index++) {
			randomNumbers[index] = (int)(random() * 100);
		}
		
		for(int randomNumber : randomNumbers) {
			System.out.print(randomNumber + " ");
		}
		System.out.println();
	}
	
	public static void printCountries() {
		String [] southAmericaCountries = new String[10];
		southAmericaCountries[0] = "Colombia";
		southAmericaCountries[1] = "Venezuela";
		southAmericaCountries[2] = "Ecuador";
		southAmericaCountries[3] = "Peru";
		southAmericaCountries[4] = "Bolivia";
		southAmericaCountries[5] = "Chile";
		southAmericaCountries[6] = "Argentina";
		southAmericaCountries[7] = "Paraguay";
		southAmericaCountries[8] = "Uruguay";
		southAmericaCountries[9] = "Brasil";
		
		for (String country : southAmericaCountries) {
			System.out.println(country);
		}
	}

}
