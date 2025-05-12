package codewars_challenges;

public class ArrayToStringWithCommas {
	public static void main(String[] args) {
		Integer[] arr = {1,2,3,4,5};
		System.out.println(arrayToString(arr));
	}
	
	public static String arrayToString(Object[] array) {
		String elements = "";
		for(int index = 0; index < array.length; index++) {
			if(index == (array.length - 1)) {
				elements += array[index] + "";
			} else {
				elements += array[index] + ",";
			}
		}
		return elements;
	}
}
