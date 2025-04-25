package codewars_challenges;

public class CountTheMonkeys {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		detailSolution(monkeyCount(15));
		detailSolution(monkeyCount(20));
	}
	
	public static int[] monkeyCount(final int n) {
		int[] count = new int[n];
		for(int i = 0; i < n; i++) {
			count[i] = i+1;
		}
		
		return count;
	}
	
	public static void detailSolution(final int[] counting) {
		for(int count: counting) {
			System.out.print(count + " ");
		}
		System.out.println();
	}

}
