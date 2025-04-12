import java.util.Scanner;
import static java.lang.Integer.parseInt;

public class SwitchUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.println("Would you like traditional or modern switch case, please type modern or traditional");		
		String option = input.nextLine();
		
		if(option.equalsIgnoreCase("Modern")) {
			modernSwitchCase(input);
		} else {
			traditionalSwitchCase(input);
		}
	}
	
	public static void traditionalSwitchCase(Scanner input) {
		System.out.println("Type any number between 1 and 12 for the years' month.");
		int numberMonth = parseInt(input.nextLine());
		
		switch(numberMonth) {
		case 1: 
			System.out.println("January");
			break;
		case 2:
			System.out.println("February");
			break;
		case 3:
			System.out.println("March");
			break;
		case 4:
			System.out.println("April");
			break;
		case 5:
			System.out.println("May");
			break;
		case 6:
			System.out.println("June");
			break;
		case 7:
			System.out.println("July");
			break;
		case 8:
			System.out.println("August");
			break;
		case 9:
			System.out.println("September");
			break;
		case 10:
			System.out.println("October");
			break;
		case 11:
			System.out.println("November");
			break;
		case 12:
			System.out.println("December");
			break;
		default:
			System.out.println("You type a wrong number");
		}

	}
	
	public static void modernSwitchCase(Scanner input) {
		System.out.println("Please type one day of the week");
		String dayOfWeek = input.nextLine();
		
		
		String dayValue = switch(dayOfWeek) {
		case "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" -> "Weekday";
		case "Saturday", "Sunday" -> "Weekend";		
		default -> {
			System.out.println("Your option is " + dayOfWeek);
			yield("Your options is wrong.");
		}
		};
		System.out.println("The day of the week that your selected was " + dayOfWeek + " and its value is " + dayValue);
	}

}
