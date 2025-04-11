import java.util.Scanner;

public class ScannerUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Please type your name: ");
		String name = input.nextLine();
		System.out.println("Please type your age: ");
		int age = input.nextInt();
		input.close();
		System.out.println("Hi " + name + " your age is " + age);
	}

}
