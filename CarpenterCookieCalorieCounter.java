/* Author: Zachary Carpenter
// Date: 08/30/2021
// Purpose: Creating a program to take user input for 
//			number of cookies and print the calories consumed.
*/

import java.util.Scanner;

public class CarpenterCookieCalorieCounter {

	public static void main(String[] args) {
		/* initialize our variables for the 
		 * number of cookies and calories per cookie
		 */
		int cookiesEaten;
		int caloriesPerCookie = 300 / (40 / 10);
		
		Scanner userInput = new Scanner(System.in);
		
		// get the user input for number of cookies
		System.out.println("Enter number of cookies eaten: ");
		cookiesEaten = userInput.nextInt();

		/* calculate the total calories by multiplying 
		 * number of cookies by calorie per cookie
		 */
		int totalCalories = cookiesEaten * caloriesPerCookie;
		
		// print the output
		System.out.println("Your calorie intake was: " 
				+ totalCalories + " calories.");

		userInput.close();
	}

}

/*	Revel solution:
import java.util.Scanner;
public class CookieCalorieCounter {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		final int numCookiesBag = 40, srvSize = 10, caloriesSrv = 300;
		final int numCookiesSrv = numCookiesBag / srvSize;
		final int caloriesCookie = caloriesSrv / numCookiesSrv;
		System.out.print("Enter number of cookies eaten: ");
		final int numCookiesEaten = input.nextInt();
		final int calorieCount = caloriesCookie * numCookiesEaten;
		System.out.println("Your calorie intake was: "
        		+ calorieCount + " calories.");
		return;
	}
}
*/