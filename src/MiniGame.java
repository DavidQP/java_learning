import static java.lang.Math.random;
import static javax.swing.JOptionPane.showInputDialog;
import static java.lang.Integer.parseInt;

public class MiniGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int guessedNumber = (int)((random() * 100) + 1);
		int attempts = 0;
		int userNumber;
		System.out.println("Behind the scenes. The number guessed is: " + guessedNumber);
		
		do {
			userNumber = parseInt(showInputDialog("Please guess a number between 1 and 100")) ;
			if(userNumber > guessedNumber ) {
				System.out.println("The number that you try to guess is below.");
			} else if(userNumber < guessedNumber ) {
				System.out.println("The number that you try to guess is above.");
			}
			attempts++;
		}while( guessedNumber != userNumber );
		
		System.out.println("Congratulations, you guessed the number");
		System.out.println("The number is " + guessedNumber);
		System.out.println("Your attemps are: " + attempts);
	}

}
