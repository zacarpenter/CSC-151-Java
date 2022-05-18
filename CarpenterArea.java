/* 	Author: Zachary Carpenter
	Date: 10/19/2021
 	Purpose: This program has a static getArea method that calculates 
 	the area for a circle, rectangle, and cylinder. 
 	The method is overloaded to accept parameters for each calculation.
*/

import java.util.Scanner;
public class CarpenterArea {

	/**getArea circle calculates the area of a circle
	 * @param radius is the radius value
	 * @return area calculation of Math.PI * radius squared
	 */
	public static double getArea(double radius) {
		return Math.PI * (radius * radius);
	}
	
	/**getArea rectangle overrides the getArea method to
	 * calculate the area of a rectangle
	 * @param length is the length value
	 * @param width is the width value
	 * @return area calculation length * width
	 */
	public static double getArea(double length, double width) {
		return length * width;
	}
	
	/**getArea cylinder overrides the getArea method to
	 * calculate the area of a cylinder
	 * @param radius is the radius value
	 * @param height is the height value (as a float) since there is already a
	 * method override with two doubles
	 * @return area calculation Math.PI * radius squared * height
	 */
	public static double getArea(double radius, float height) {
		return Math.PI * (radius * radius) * height;
	}
	
	// main
	public static void main(String[] args) {
		// create Scanner object
		Scanner keyboard = new Scanner(System.in);
		
		// purpose
		System.out.println("This program calculates the area for a circle,"
				+ " rectangle, and cylinder. Then prints the values.\n");
		
		// ask for user input to calculate area
		System.out.println("=== Area Calculator ===");
		System.out.print("\n");
		
		// get the radius of the circle
		System.out.print("Enter the radius to calculate circle area:");
		double circleRadius = keyboard.nextDouble();
		
		// get the length and width of the rectangle
		System.out.print("Enter the width to calculate rectangle area:");
		double width = keyboard.nextDouble();
		System.out.print("Enter the length to calculate rectangle area:");
		double length = keyboard.nextDouble();
		
		// get the radius and height of the cylinder
		System.out.print("Enter the base radius to calculate cylinder area:");
		double cylinderRadius = keyboard.nextDouble();
		System.out.print("Enter the height to calculate cylinder area:");
		float height = keyboard.nextFloat();
		
		System.out.print("\n");
		
		System.out.println("--------\r\n"
				+ "Results:\r\n"
				+ "--------\n");
		
		// print the results
		System.out.printf("The area of the circle is: %.2f\n", 
				CarpenterArea.getArea(circleRadius));
		
		System.out.printf("The area of the rectangle is: %.2f\n", 
				CarpenterArea.getArea(length, width));
		
		System.out.printf("The area of the cylinder is: %.2f\n", 
				CarpenterArea.getArea(cylinderRadius, height));
		
		// close the Scanner
		keyboard.close();
	}
}
