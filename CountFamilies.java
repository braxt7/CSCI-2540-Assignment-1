// Braxton Chambers
package assg1_chambersb19;
import java.util.*;

public class CountFamilies 
{
	public static void main(String[] args)
	{
		// Gets the number of families and initializes arrays and variables.
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Please enter the number of families: ");
		int numOfFamilies = keyboard.nextInt();
		int[] familiesArray = new int[numOfFamilies];
		int largestIncome = 0;

		
		// Gets the income for each family in the array and compares each income to find the largest.
		for (int i = 0; i < numOfFamilies; i++)
		{
			System.out.print("Enter an income: ");
			familiesArray[i] = keyboard.nextInt();
			if (familiesArray[i] > largestIncome)
				largestIncome = familiesArray[i];
		}
		System.out.println("The maximum income is: " + largestIncome);
		double lowerIncome = largestIncome * 0.10;
		
		// Compares each income with the 10% of the largest income; prints if true
		System.out.println("The incomes of families making less than 10% of the maximum are: ");
		for (int i = 0; i < numOfFamilies; i++)
		{
			if (familiesArray[i] < lowerIncome)
				System.out.println(familiesArray[i]);
		}
		System.out.println("for a total of " + numOfFamilies + " families");
		keyboard.close();
	}
}
