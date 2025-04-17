package codewars_challenges;

public class Reflections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] results = new int[6][2];
		results[0] = reflectPoint(new int[] {0,0}, new int[] {1,1});
		results[1] = reflectPoint(new int[]{2,6}, new int[]{-2,-6});
		results[2] = reflectPoint(new int[]{10, -10}, new int[]{-10, 10});
		results[3] = reflectPoint(new int[]{1, -35}, new int[]{-12, 1});
		results[4] = reflectPoint(new int[]{1000, 15}, new int[]{-7, -214});
		results[5] = reflectPoint(new int[]{0,0}, new int[]{0,0});
		
		System.out.println("The results are");
		for(int[] result : results) {
			for(int point : result) {
				System.out.print(point + " ");
			}
			System.out.println();
		}
		
		
	}
	
	public static int[] reflectPoint(int[] p, int[] q) {
		
		return new int[]{ (int)((2 * q[0] - p[0])), (int)((2 * q[1] - p[1])) };
	}

}
