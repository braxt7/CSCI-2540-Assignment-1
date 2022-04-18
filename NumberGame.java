// Braxton Chambers
package assg1_chambersb19;
import java.util.*;

public class NumberGame 
{
	public static void main(String[] args)
	{
		// Program generates a random number between 0 and 99
		int secret;
		Random generator = new Random();
		secret = generator.nextInt(100);
		int userGuess;
		Scanner keyboard = new Scanner(System.in);
		int totalGuesses = 0;
		System.out.println("Guess a number between 0 and 99");
		
		// Asks the user to guess the random number while totalGuesses keeps count of the user's guesses
		do  {
			userGuess = keyboard.nextInt();
			totalGuesses++;
			
			if (userGuess > secret) 
			{
				System.out.println("The number is lower!");
			}
			else if (userGuess < secret) 
			{
				System.out.println("The number is higher!");
			}
			else
			{
				System.out.println("You guessed correctly! The number is " + secret);
				System.out.println("Number of guesses: " + totalGuesses);
			}	
		} while (userGuess != secret);
		keyboard.close();
	}
}
