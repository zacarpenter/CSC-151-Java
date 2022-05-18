/* 	Author: Zachary Carpenter
	Date: 10/27/2021
 	Purpose: This program asks the user for a password. It then determines if
 	the password is valid and meets the requirements.
*/
import java.util.Scanner;
public class CarpenterPasswordVerifier {
	
	/**validPassword checks if the user input password meets the requirements:
	 * at least 6 characters long, has at least one lower case character, at
	 * least one upper case character, and at least one digit
	 * @param password is the password string input by the user
	 * @return a boolean if the password meets the requirements
	 */
	public static boolean validPassword(String password) {
		
		// check if the password is at least 6 characters long first
		if (password.length() < 6) {
			return false;
		}
		
		/* initialize the booleans for one upper case, one lower case letter,
		 * one digit
		*/
		boolean hasLowerCase = false;
		boolean hasUpperCase = false;
		boolean hasDigit = false;
		
		for (int i = 0; i < password.length(); i++) {
			// loop through the password and check the character at each index
			char ch = password.charAt(i);
			// if the character is lower case change the corresponding boolean
			if (Character.isLowerCase(ch)) {
				hasLowerCase = true;
			}
			// if the character is upper case change the corresponding boolean
			else if (Character.isUpperCase(ch)) {
				hasUpperCase = true;
			}
			// if the character is a digit change the corresponding boolean
			else if (Character.isDigit(ch)) {
				hasDigit = true;
			}
			
			/* if all of the booleans have changed to true, short circuit and 
			 * break from the loop
			 */
			if (hasLowerCase && hasUpperCase && hasDigit) {
				break;
			}
		}
	
		// all of the requirements must be true, otherwise return false
		if(!(hasLowerCase && hasUpperCase && hasDigit)) {
			return false;
		}
		
		return true;
	}

	// main
	public static void main(String[] args) {
		
		// purpose
		System.out.println("This program checks if a user input password"
				+ " is valid.\n" + "The password must be at least six"
						+ " characters and have at least one: lower case"
						+ " character, upper case character, and digit.\n");
		
		// create Scanner object
		Scanner kbd = new Scanner(System.in);
		
		// get user input
		System.out.print("Enter password to be verified:");
		String password = kbd.nextLine();
		
		// check if the password is valid and output the results
		if (validPassword(password)) {
			System.out.println("Valid password");
		}
		else {
			System.out.println("Invalid password");
		}
		
		kbd.close();
	}
}