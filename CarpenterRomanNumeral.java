// Author: Zachary Carpenter
// Date: 09/11/2021
// Purpose: This program takes a number input and converts into the corresponding Roman numeral

import java.util.Scanner;

public class CarpenterRomanNumeral {

	public static void main(String[] args) {
		int input; // create our variable to hold the number
		// create a Scanner object for input
		Scanner keyboard = new Scanner(System.in);

		// get our input from the user
		System.out.println("Enter a number in the range 1 - 10: ");
		input = keyboard.nextInt();
		
		// display the roman numeral
		switch (input)
		{
			case 1:
				System.out.println("I");
				break;
			case 2:
				System.out.println("II");
				break;
			case 3:
				System.out.println("III");
				break;
			case 4:
				System.out.println("IV");
				break;
			case 5:
				System.out.println("V");
				break;
			case 6:
				System.out.println("VI");
				break;
			case 7:
				System.out.println("VII");
				break;
			case 8:
				System.out.println("VIII");
				break;
			case 9:
				System.out.println("IX");
				break;
			case 10:
				System.out.println("X");
				break;
			default:
				System.out.println("Enter a number between 1 and 10.");
		}
		
		keyboard.close();
	}

}
