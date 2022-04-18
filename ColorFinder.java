// Braxton Chambers
package assg1_chambersb19;
import java.util.Scanner;

public class ColorFinder 
{
	public static void main(String[] args)
	{
		// Asks user to enter a sentence which is stored in userString.
		System.out.println("Enter a sentence: ");
		Scanner keyboard = new Scanner(System.in);
		String userString;
		userString = keyboard.nextLine();
		// The string is converted to lower case to prevent case sensitive issues.
		userString = userString.toLowerCase();
		// Initializes an array containing the 6 primary colors. intIndex is used to compare each color in the following loop.
		int indexColor = 0;
		String[] primaryColors = {"red", "blue", "green", "magenta", "yellow", "cyan"};
		
		// Loop checks if the string contains an additive or subtractive color. The first 3 in the array are additive and the last 3 are subtractive.
		for (int i = 0; i < 6; i++)
		{
			indexColor = userString.indexOf(primaryColors[i]);
			if (indexColor != -1 && i < 3) 
			{
				System.out.println("Additive primary color found.");
				System.exit(0);
			}
			else if (indexColor != -1 && i > 2) 
			{
				System.out.println("Subtractive primary color found.");
				System.exit(0);
			}
		}
		
		// Prints that no primary colors were found if no color is found in the previous loop
		System.out.println("No primary colors found.");
		keyboard.close();
	}
}
