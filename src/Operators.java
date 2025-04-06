
public class Operators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("We will show java operators examples");
		System.out.println("|Arimethics|");
		System.out.println();
		arimetical();
		System.out.println();
		System.out.println("|Relational|");
		System.out.println();
		relational();
		System.out.println();
		System.out.println("|Logical|");
		System.out.println();
		logical();
		System.out.println();
		System.out.println();
		System.out.println("|Increment or decrement|");
		System.out.println();
		System.out.println();
		incrementOrDecrement();
		System.out.println();
		System.out.println("|Bit to bit|");
		System.out.println();
		System.out.println();
		bitToBit();
		System.out.println();
		System.out.println("|Ternary operator|");
		System.out.println();
		System.out.println();
		ternary();
		System.out.println();
		System.out.println("|Compose assignment|");
		System.out.println();
		System.out.println();
		composeAssignment();
		System.out.println();
	}
	
	public static void arimetical() {
		double bill = 759;
		int people = 5;
		double paymentPerPerson = bill/people;
		System.out.println("The payment per person is " + paymentPerPerson + " USD");
	}
	
	public static void relational() {
		byte age = 15;
		String name = "Manuel";
		System.out.println("Is " + name  + " have the legal age? " + (age > 18));
	}
	
	public static void logical() {
		boolean isBadWeather = true;
		int legalAge = 18;
		int currentAge = 19;
		boolean allowToLeave = isBadWeather && currentAge >=  legalAge;
		System.out.println("The weather is bad? " + isBadWeather);
		System.out.println("The legal age in current country is " + legalAge);
		System.out.println("How old am I? " +  currentAge);
		System.out.println("You have permission to leave? " + allowToLeave);
	}
	
	public static void incrementOrDecrement() {
		double tasks = 5;
		int newTask = 1;
		System.out.println("Num of previous tasks " + tasks);
		tasks++;
		System.out.println("Current tasks done are : " + tasks);
		
		
	}
	
	public static void bitToBit() {
		int even = 8;
		boolean isEven = (even & 1) == 0;
		System.out.println("The number " +  even +" is even? " + isEven)
		;
	}
	
	public static void ternary() {
		int legalAge = 18;
		int currentAge = 25;
		System.out.println("You have the legal age for drink? " + (currentAge > legalAge ? "Yes, I have" :  "No, I don't have"));
	}
	
	public static void composeAssignment() {
		double currentSalary = 5600;
		double increment = 5600 * 0.05;
		System.out.println("You current salary is: " + currentSalary);
		currentSalary += increment;
		System.out.println("You new salary with the increment is: "  + currentSalary);
	}

}
