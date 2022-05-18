/* 	Author: Zachary Carpenter
	Date: 11/10/2021
 	Purpose: This program holds the constructor and getAverage method to be used
 	in our TestScoresDemo. It sets the value of the scoreArray or throws an 
 	IllegalArgumentException. Finally, calculates the average of the array
 	elements.
*/
public class CarpenterTestScores {
	
	// field to hold the array
	private double scoreArray[];
	
	/**
	 * Constructor takes a user input array and throws an 
	 * IllegalArgumentException if the array includes invalid numbers
	 * @param s[] is the user input array that's passed in
	 * @exception IllegalArgumentException is thrown if the array item is less
	 * than 0 or greater than 100
	 */
	public CarpenterTestScores(double s[]) throws IllegalArgumentException, 
		CarpenterInvalidTestScores 
	{
		scoreArray = new double[s.length];
		
		for (int i = 0; i < s.length; i++) {
			if (s[i] < 0 || s[i] > 100) {
				//System.out.println("Test scores must have a value less than 
				//100" + " and greater than 0.");
				throw new IllegalArgumentException("Test scores must have a"
						+ " value less than 100 and greater than 0.");
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
}