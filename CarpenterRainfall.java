/* 	Author: Zachary Carpenter
	Date: 10/12/2021
 	Purpose: This program takes user input and stores it in an array.
 	Then uses methods to display the total and average rainfall for the year.
 	As well as the months with the highest and lowest values.
*/
import java.util.Scanner;
public class CarpenterRainfall {
	
	// fields
	private double totalRainfall;
	private double averageRainfall;

	/** Calculate and return the total rainfall
	 * @param rainAmount[] is an array of numbers
	 * it holds the rain values entered by the user
	 * @return totalRainfall amount calculated by adding the array items
	 */
	public double totalRainfall(double rainAmount[]) {
		// loop through the array parameter and add the items to the total
		for (int i = 0; i < rainAmount.length; i++) {
			totalRainfall += rainAmount[i]; 
		}
		return totalRainfall;
	}
	
	/** Calculate and return the average rainfall
	 * @return the averageRainfall calculation
	 */
	public double averageRainfall() {
		// divide the totalRainfall by 12 (maximum number of months)
		averageRainfall = totalRainfall / 12;
		return averageRainfall;
	}
	
 
	/** Find and return the highest value in an array of numbers
	 * @param rain is an array of numbers
	 * @return the highest number in the array
	 */
	public double findHighestValue(double rain[]) {
		double highest = rain[0];
		for (int i = 1; i < rain.length; i++) {
			if (rain[i] > highest) {
				highest = rain[i];
			}
		}
		return highest;
	}
	
	/** Find and return the positions of the highest value in an 
	 * array of numbers
	 * @param rain is the array of numbers
	 * @return the array position of the highest number in the array
	 */
	public int findHighestIndex(double rain[]) {
		int highIndex = 0;
		for (int i = 1; i < rain.length; i++) {
			if (rain[i] > rain[highIndex]) {
				highIndex = i;
			}
		}
		return highIndex;
	}
	
	
	/** Written by Professor T on 2019-03-11
	 * Find and return the lowest value in an array of numbers 
	 * (date type double)
	 * @param rain is the array of numbers
	 * @return the lowest number in the array
	 * I removed the static modifier, it flagged a warning in my code
	 */
	public double findLowestValue (double rain[]) {
		double lowest = rain[0];
		for (int counter = 1; counter < rain.length; counter++) {
			if (rain[counter] < lowest)
				lowest = rain[counter];
		}
		return lowest;
	}
	
	/** Written by Professor T on 2019-03-11
	 * Find and return the position of the lowest value in an array of numbers
	 * @param rain is the array of numbers
	 * @return the array position of the lowest number in the array
	 * I removed the static modifier, it flagged a warning in my code
	 */
	public int findLowestIndex (double rain[]) {
		int lowIndex = 0;
		for (int counter = 1; counter < rain.length; counter++) {
			if (rain[counter] < rain[lowIndex]) {
				lowIndex = counter;
			}
		}
		return lowIndex;
	}
	
	
	// main
	public static void main(String[] args) {
		
		// program purpose
		System.out.println("This program gets user input for rainfall values."
				+ " It prints the total and average rainfall values for the"
				+ " year.\nAdditionally, it prints the highest and lowest"
				+ " months of rainfall.\n");
		
		// create Scanner object
		Scanner keyboard = new Scanner(System.in);
		
		
		// array to hold the months of the year
		String months[] = {"January", "February", "March", "April", "May", 
				"June", "July", "August", "September", "October", 
				"November", "December"};
		
		// create a new array to hold the rain amounts entered by the user
		double rain[] = new double[12];
		
		
		// create a CarpenterRainfall object to access the methods
		CarpenterRainfall rainfall = new CarpenterRainfall();
		
		
		/* loop through the months array and ask the user for the rain amount
		 * for each month
		*/
		for (int i = 0; i < months.length; i++) {
			
			// while loop to validate the user input is not a negative number
			while (true) {
				
				// ask the user for the rainfall amount
				System.out.printf("What is the rainfall for %s? ", months[i]);
				
				// if the input amount is a double then add to the rain array
				if (keyboard.hasNextDouble()) {
					
					// add the entered amount to the rain array
					rain[i] = keyboard.nextDouble();
					
					/* if the amount entered is a positive number, break from 
					 * the while loop, moving to the next month index of the 
					 * for loop 
					 * (asking the user for the amount of the next month)
					 */
					if (rain[i] >= 0) {
						break;
					} // else prompt the user to enter a positive number
					else {
						System.out.println("Please enter a positive number "
								+ "for the rainfall amount.");
					}
				}
				
			}
			
		}
		
		
		System.out.println("\n");
		
		// call the totalRainfall method and print
		System.out.println("Total rainfall for the year: " 
		+ rainfall.totalRainfall(rain) + " inches.");
		
		// call the averageRainfall method and print
		System.out.printf("Average monthly rainfall: %.2f inches.\n",
				rainfall.averageRainfall());
		
		/* The name of the month with the MOST rain,
		 * with the corresponding amount for that month
		 * call findHighestIndex and findHighestValue
		*/
		System.out.println(months[rainfall.findHighestIndex(rain)]
				+ " had the most rain, with: "
				+ rainfall.findHighestValue(rain)
				+ " inches.");
		
		/* The name of the month with the LEAST rain, 
		 * with the corresponding amount for that month
		 * call findLowestIndex and findLowestValue
		 */
		System.out.println(months[rainfall.findLowestIndex(rain)] 
				+ " had the least rain, with: "
				+ rainfall.findLowestValue(rain)
				+ " inches.");
		
		keyboard.close();
	}
}
