
public class ForUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Multiply tables");
		int lengthTable = 10;
		int limitByTable = 10;
		
		for(int i = 1; i <= lengthTable; i++ ) {
			for(int j = 1; j <= limitByTable; j++) {
				System.out.println(i + " x " + j + " = " + (i*j));
			}
			System.out.println();
		}
	}

}
