/* 	Author: Zachary Carpenter
	Date: 11/10/2021
 	Purpose: This program has a constructor that takes a user input array of 
 	scores. The constructor also throws IllegalArgumentException if the score
 	is negative or greater than 100. There is a method to calculate the average.
 	The main gets the user input for the number of scores and the score values.
 	Finally, the program tries to print the average scores.
*/
import java.util.Scanner;
public class CarpenterTestScoresDemo {
	
	public static void main(String[] args) throws CarpenterInvalidTestScores {
		
		// purpose
		System.out.println("CarpenterTestScoresDemo - CarpenterTestScores\n"
				+ "------------------------------------------------\n"
				+ "This program asks the user for a total number of"
				+ " scores (ex. 5).\n" + "Then for asks the user for each score"
				+ ".\n" + "Finally it prints the average of the scores.\n" +
				"*Note* Scores must be greater than 0 and less than 100.\n");
		
		// create Scanner object
		Scanner kbd = new Scanner(System.in);
		
		// get the user input for number of scores (array length)
		System.out.print("Enter number of test scores: ");
		int numScores = kbd.nextInt();
		
		// initialize an array to hold the user input scores
		double scoreArray[] = new double[numScores];
		
		/*
		 * loop through and ask the user for a score, the array length is the
		 * numScores variable
		 * store the scores in the scoreArray
		 */
		for (int i = 0; i < numScores; i++) {
			System.out.printf("Enter test score %d: ", i+1);
			scoreArray[i] = kbd.nextDouble();
		}
		
		/*
		 * create a new TestScores object - passing the user input scoreArray
		 * as the argument
		 */
		CarpenterTestScores scores = new CarpenterTestScores(scoreArray);
		
		/*
		 * try to call the getAverage method to calculate the average of the 
		 * scoreArray and print to the console
		 * catch the IllegalArgumentException - print to the console the
		 * exception message
		 */
		try {
			System.out.println("Test score average: " + scores.getAverage());
		}
		catch(IllegalArgumentException e) {
			System.out.println("Test scores must have a value less than 100"
					+ " and greater than 0.");
		}
		
		// close resource
		kbd.close();
	}
}
