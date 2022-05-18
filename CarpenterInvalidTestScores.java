/* 	Author: Zachary Carpenter
	Date: 11/10/2021
 	Purpose: This program extends the Exception class and creates my own
 	exception that prints the invalid score.
*/
public class CarpenterInvalidTestScores extends Exception {
	
	/**
	 * Constructor
	 * calls the superclass and prints the custom error
	 */
	public CarpenterInvalidTestScores() {
		super("Error: Invalid test score.");
	}
	
	/**
	 * Constructor takes a score argument to print the specific invalid score
	 * @param score is the score that is invalid
	 */
	public CarpenterInvalidTestScores(double score) {
		super("Error: Test score '" + score + "' is invalid.");
	}
}