
public class StringUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String phrase = "Hi, nice to meet you!";
		int phraseLength = phrase.length();
		int floor = (int)(Math.random() * ((int)(phraseLength/2)));
		int ceil = (int)((Math.random() * ((int)(phraseLength/2))) + floor + 1);
 		String chunk = phrase.substring(floor, ceil);
 		int chunkLength = chunk.length();
 		int index = (int)(Math.random() * chunkLength);
 		char chunkLetter = chunk.charAt(index);
 		boolean isEmptySpace = chunkLetter == ' ';
 		
		System.out.println("The element have " + phraseLength + " letters");
		System.out.println("The chunk of the element is " + chunk);
		System.out.println("The index is " + index);
		System.out.println("The letter in the position "+ index  + " of chunk is " + chunkLetter);
		System.out.println("The selected letter is empty? " + isEmptySpace);
	}

}
