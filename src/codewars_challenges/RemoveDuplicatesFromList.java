package codewars_challenges;

import java.util.Iterator;

public class RemoveDuplicatesFromList {

	public static void main(String[] args) {
		
		resultDetails(distinctV2(new int[0]));
		resultDetails(distinctV2(new int[]{ 1 }));
		resultDetails(distinctV2(new int[]{1,2}));
		resultDetails(distinctV2(new int[]{1,1,2}));
		resultDetails(distinctV2(new int[]{1, 1, 1, 2, 3, 4, 5}));
		resultDetails(distinctV2(new int[]{1, 2, 2, 1, 3, 3, 1, 4, 2, 4, 5, 6, 7, 7, 7}));
	}
	
	public static void resultDetails(final int[] solution) {
		for (int element : solution) {
			System.out.print(element);
		}
		
		System.out.println();
	}
	
	public static int[] distinct(final int[] array) {
		
		if(array.length == 0) return new int[]{};
		
		int[] distinctElements = new int[0];
		
		for(int distinctElement: array) {
			if(distinctElements.length == 0) {
				distinctElements = new int[1];
				distinctElements[0] = distinctElement;
			} else {
				boolean isDistinct = true;
				for(int possibleDistinctElement: distinctElements) {
					if(possibleDistinctElement == distinctElement) {
						isDistinct = false;
						break;
					}
				}
				
				if(isDistinct) {
					int[] newDistinctElements = new int[distinctElements.length + 1];
					for(int index = 0; index < distinctElements.length; index++) {
						
						newDistinctElements[index] = distinctElements[index];
					}
					newDistinctElements[newDistinctElements.length -1] = distinctElement;
					distinctElements = newDistinctElements;
 				}
		}
	}
		
		
		return distinctElements;
	}
	
	public static int[] distinctV2(final int[] array) {
		if(array.length == 0) return new int[] {};
		
		int[] distinctElements = new int[0];
		
		for (int distinctElement : array) {
			boolean isDistinct = true;
			for(int possibleDistinctElement: distinctElements) {
				if(possibleDistinctElement == distinctElement) {
					isDistinct = false;
					break;
				}
			}
			
			if(isDistinct) {
				int[] newDistinctElements = new int[distinctElements.length + 1];
				for(int index = 0; index < distinctElements.length; index++) {
					
					newDistinctElements[index] = distinctElements[index];
				}
				newDistinctElements[newDistinctElements.length -1] = distinctElement;
				distinctElements = newDistinctElements;
				}
		}
		
		return distinctElements;
	}
	
}
