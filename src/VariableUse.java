
public class VariableUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte age = 17; // declare and initialize a variable
		var name = "Hi, my name is ..."; // inference
		var count = 0;
		count = 99999999;
		System.out.println(age);
		System.out.println(count);
		System.out.println(name);
		System.out.println("--------------------");
		System.out.println();
		// Multiple declaration
		int bill, tax, total;
		bill = 56;
		tax = 2;
		total = bill + tax;
		System.out.println("Bill   " + bill);
		System.out.println("Tax    " + tax);
		System.out.println("Total: " + total);
		// Another example
		System.out.println();
		int apples = 5, bananas = 9, totalFruit = apples + bananas;
		System.out.println("Total fruit: " + totalFruit);
		// Assign one variable
		int cundinamarcaPeople, boyacaPeople = 90000; // This line only assign a value to boyacaPeople variable
		System.out.println("The people in Boyaca are: " + boyacaPeople);

	}

}
