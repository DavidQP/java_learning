
public class Factorial {

	public static void main(String[] args) {
		int limit = 50;
		long accum = 1;
		
		for(int i= 1;  i <= limit; i++) {
			accum *= i;
		}
		
		System.out.println("The factorial of " + limit + " is " + accum);

	}

}
