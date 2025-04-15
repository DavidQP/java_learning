
public class MatrixUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] matrix = new int[10];
		int [] ages = {5,6,7,8,9};
		
		for(int i = 0; i < 10; i++) {
			matrix[i] = i;
		}
		
		// Print ages' array
		for(int ageIndex = 0; ageIndex < ages.length; ageIndex++) {
			String message = !(ageIndex == (ages.length -1)) ? " " : "\n";
			System.out.print(ages[ageIndex] + message);
		}
		System.out.print("Gracias");
	}

}
