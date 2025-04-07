import java.math.BigInteger;

public class MathUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int randomNumber = (int)(Math.random() * 10);
		double squareNumber = Math.pow(randomNumber, 2);
		
		System.out.println("The random number is " + randomNumber);
		System.out.println("The square number of " + randomNumber + " is " + squareNumber);
		
		// Another example
		BigInteger base =  BigInteger.valueOf(25);
		int exponent = 321;
		BigInteger bigNumer = base.pow(exponent);
		System.out.println("The big number is " + bigNumer);
		
		// Another example
		double rate, exchange;
		rate = 2.6;
		exchange = 1.5;
		double ieeeResult =  Math.IEEEremainder(rate, exchange);
		System.out.println(ieeeResult);
		
		// Get the greater number between two numbers
		int greater = Math.max(5959, 74857);
		System.out.println("The greater number is " + greater);
	}

}
