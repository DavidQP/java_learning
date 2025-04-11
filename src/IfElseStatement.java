import java.util.Scanner;

public class IfElseStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Colombian's age range
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please, type your age");
		int age = input.nextInt();
		
		// Business logic
		/*
		if(age > 0 && age < 18) {
			System.out.println("You are a child.");
		} else if(age >= 18 && age <= 120) {
			System.out.println("You are legally an adult.");
		} else {
			System.out.println("Your typed age is not in the range, please type a number between 0 and 120");
		}
		*/
		
		// An straightforward implementation about the business logic
		if(age >= 0 && age < 18) System.out.println("You are a child, please enjoy your childhood.");
		else if(age <= 35) System.out.println("You only are young.");
		else if(age <= 60) System.out.println("You are mature.");
		else if(age <= 90) System.out.println("Please, take care.");
		else System.out.println("Where are you going with that age? please take care.");

	}

}
