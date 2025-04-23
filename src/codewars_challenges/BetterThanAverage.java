package codewars_challenges;

public class BetterThanAverage {

	public static void main(String[] args) {
		
		System.out.println(betterThanAverage(new int[]{}, 5));
		System.out.println(betterThanAverage(new int[]{2,3}, 5));
		System.out.println(betterThanAverage(new int[]{100,40,34,57,29,72,57,88}, 75));
		System.out.println(betterThanAverage(new int[]{12,23,34,45,56,67,78,89,90}, 69));
		System.out.println(betterThanAverage(new int[]{100,90}, 11));
	}
	
	public static boolean betterThanAverage(int[] classPoints, int yourPoints) {
		
		if(classPoints.length == 0) {
			return yourPoints > 0;
		}
		
		int classPointsAverage = 0;
		
		for(int grade: classPoints) {
			classPointsAverage += grade;
		}
		
		return yourPoints > ((classPointsAverage)/classPoints.length);
	}

}
