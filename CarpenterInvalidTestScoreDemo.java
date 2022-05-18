/* 	Author: Zachary Carpenter
	Date: 11/10/2021
 	Purpose: This program has a constructor and getAverage method. 
 	It sets the value of the scoreArray or throws our CarpenterInvalidTestScores
 	exception. Finally, calculates the average of the array
 	elements. In the main, the user is asked for input and the program prints
 	the results to the console.
*/
import java.util.Scanner;
public class CarpenterInvalidTestScoreDemo {

	// field to hold the array
	private double scoreArray[];
	
	/**
	 * Constructor takes a user input array and throws an 
	 * IllegalArgumentException if the array includes invalid numbers
	 * @param s[] is the user input array that's passed in
	 * @exception IllegalArgumentException is thrown if the array item is less
	 * than 0 or greater than 100
	 */
	public CarpenterInvalidTestScoreDemo(double s[]) throws 
	CarpenterInvalidTestScores 
	{
		scoreArray = new double[s.length];
		
		for (int i = 0; i < s.length; i++) {
			if (s[i] < 0 || s[i] > 100) {
				//System.out.println("Test scores must have a value less than 
				//100" + " and greater than 0.");
				//throw new IllegalArgumentException("Test scores must have a "
						//+ "value less than 100 and greater than 0.");
				throw new CarpenterInvalidTestScores(s[i]);
			}
			else {
				scoreArray[i] = s[i];
			}
		}
	}
	
	/**
	 * getAverage returns the average of the test scores array
	 * @return average is the total of the array divided by number of array
	 * elements
	 */
	public double getAverage() {
		// initialize a total to hold our total scores
		double total = 0.0;
		
		// loop through and add the scoreArray items to the total
		for (int i = 0; i < scoreArray.length; i++) {
			total += scoreArray[i];
		}
		
		// calculate and return average
		return (total / scoreArray.length);
	}

	// main
	public static void main(String[] args) throws CarpenterInvalidTestScores {
		
		// purpose
		System.out.println("CarpenterInvalidTestScoresDemo - "
				+ "CarpenterInvalidTestScores\n"
				+ "----------------------------------------------------------\n"
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
		try {
			CarpenterInvalidTestScoreDemo scores = new 
					CarpenterInvalidTestScoreDemo(scoreArray);
			System.out.println("Test score average: " + scores.getAverage());
		}
		catch(CarpenterInvalidTestScores e) {
			System.out.println(e);
		}
		
		// close resource
		kbd.close();
	}
}
