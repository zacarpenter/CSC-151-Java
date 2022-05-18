// Author: Zachary Carpenter
// Date: 09/24/2021
// Purpose: write a method named showChar - accepts 2 arguments
// 			reference to a String object and integer
//			displays the character at the position of the integer provided

//package showCharMethod;

package showCharMethod;

import java.util.Scanner;

public class CarpenterMethod_showChar {

	public static void main(String[] args) {
		
		// create Scanner object
		Scanner keyboard = new Scanner(System.in);
		// create a variable for our string input
		String input;
		// create a variable for our int input
		int index;
		
		// get the string from the user
		System.out.print("Enter a line of text: ");
		// store the string 
		input = keyboard.nextLine();
		
		// get the int from the user
		System.out.print("Enter your index: ");
		// store the int as the variable index
		index = keyboard.nextInt();
		
		// pass the input and index variables as arguments
		showChar(input, index);
		
		keyboard.close();

	}
	
	// creating showChar method to accept
	// @param String str - the string passed to the method
	// @param int index - the character position in the string
	public static void showChar(String str, int index) {
		// using the string method charAt() to return
		// the character at the index of int index for string str
		System.out.print(str.charAt(index));
	}
}



// Revel alt solution:
/*
import java.util.Scanner;
public class Method_showChar {
    public static void showChar(String str, int i) {
        System.out.printf("%c%n", str.charAt(i));
        return;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter a line of text: ");
        String line = input.nextLine();
        System.out.printf("Enter your index: ");
        showChar(line, input.nextInt());
        return;
    }
}
*/