/* 	Author: Zachary Carpenter
	Date: 10/27/2021
 	Purpose: This program takes user input numbers separated by a comma and
 	adds them together, printing the final result.
*/
import java.util.Scanner;
public class CarpenterNumberSum {
	
	/**numSum takes a user input string - nums - and splits it at the commas.
	 * It then adds together the values input by the user
	 * @param nums is the string of numbers entered by the user, separated by
	 * a comma
	 */
	public static void numSum(String nums) {
		
		// tokenize and split the nums parameter at the commas
		String[] tokens = nums.split(",");
		
		// initialize the total
		int total = 0;
		 
		/* loop through each token and add to the total, 
		 * parsing the each integer
		 */
		for (String t : tokens) {
			total += Integer.parseInt(t);
		}
		
		// format the out string
		System.out.printf("Result of %s = %d", nums.replace(',', '+'),total);
	}

	
	// main
	public static void main(String[] args) {
		
		// purpose
		System.out.println("This program asks the user to input numbers"
				+ " separated by commas.\n" + "Next it adds those numbers"
						+ " together and prints the result.\n");
		
		// create Scanner object
		Scanner kbd = new Scanner(System.in);
		
		// get user input for comma separated numbers
		System.out.print("Enter numbers separated by commas:");
		String csv = kbd.nextLine();
		
		// print the output
		System.out.println();
		numSum(csv);
		
		kbd.close();
	}
}
