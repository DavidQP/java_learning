package codewars_challenges;

public class GrasshopperPersonalizedMessage {

	// https://www.codewars.com/kata/5772da22b89313a4d50012f7/train/java
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Examples
		System.out.println(greet("Daniel", "Daniel"));
		System.out.println(greet("Greg", "Daniel"));
		System.out.println(greet("", "Lucas"));
	}
	
	public static String greet(String name, String owner) {
		return "Hello " + (name.equals(owner) ? "boss" : "guest");
	}

}
