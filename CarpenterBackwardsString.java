/* 	Author: Zachary Carpenter
	Date: 10/27/2021
 	Purpose: This program asks the user for a string. Then using the backwards
 	method, it prints the reversed string.
*/
import java.util.Scanner;
public class CarpenterBackwardsString {
	
	/** backwards accepts a string argument and prints the string backwards
	 * @param str a string input by the user
	 */
	public static void backwards(String str) {
		// initialize a string to store our backwards string
		String backwardStr = "";
		// declare a character to store our current character
		char ch;
		
		// loop through the str parameter
		for (int i = 0; i < str.length(); i++) {
			// get the character
			ch = str.charAt(i);
			// add each character in front of the existing string
			backwardStr = ch + backwardStr;
		}
		
		// print the backwards formatted string
		System.out.println("Reversed string: " + backwardStr);
	}
	
	// main
	public static void main(String[] args) {
		
		// purpose
		System.out.println("This program asks the user for a string"
				+ " and then prints that string in reverse.\n");
		
		// create Scanner object
		Scanner kbd = new Scanner(System.in);
		
		// get user input for the string
		System.out.print("Enter a string:");
		String str1 = kbd.nextLine(); 
		
		// call the static backwards method passing the string entered by user
		backwards(str1);
		
		// close Scanner
		kbd.close();
	}

}

/*
import java.util.Scanner;
public class BackwardString {
	
	public static String backwardString(String s){
		String s2 = "";
		
		for(int i=s.length()-1; i >= 0; i--){
			s2 += s.substring(i, i+1);
		}
		
		return s2;
	}
	
	public static void main(String args[]){
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a string:");
		String s = scanner.nextLine();
		
		System.out.print(backwardString(s));
	}
}*/

