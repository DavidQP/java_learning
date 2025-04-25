package OOP;

import java.util.Scanner;

public class Clothes {

	//private enum clothesSize { S, SM, X, XL, XXL };
	
	enum Size {
		
		SMALL("S"), MEDIUM("M"), LARGE("L"), XLARGE("XL");
		private String clothesSize;
		
		private Size(String clothesSize) {
			this.clothesSize = clothesSize;
		}
		
		public String getSize() {
			return this.clothesSize;
		}
	}
	
	public static void main(String[] args) {
		
		 Scanner input = new Scanner(System.in);
		 System.out.println("Please, input one of those sizes(SMALL,MEDIUM,LARGE,XLARGE)");
		 String size = input.nextLine().toUpperCase();
		 Size selectedSize = Enum.valueOf(Size.class, size);
		 System.out.println("The size is" + selectedSize);
		 System.out.println("The size is: " + selectedSize.getSize());
		 
	}

}
