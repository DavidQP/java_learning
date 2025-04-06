
public class ConstantUse {
	
	private static double PI=3.141592653589;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int example;  // local constant not constant class
		final int legalAge = 20; // Once declared the constant, you can't change it.
		example = 15;
		// Real example
		final double apulgadas=2.54;
		double distance = 7;
		double inches = 7 * 2.54;
		System.out.println("Conversion cms to inches");
		System.out.println("Constant to able conversion: " + 2.54);
		System.out.println("Value: "  + distance + " cms");
		System.out.println(distance + " cms to inches is "  + inches + " inches");
	}

}
