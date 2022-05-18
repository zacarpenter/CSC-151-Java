/* 	Author: Zachary Carpenter
	Date: 09/29/2021
 	Purpose: create a class called Temperature that holds temp in
 	Fahrenheit and provides methods to convert to Celsius and Kelvin
*/

import java.util.Scanner;
public class CarpenterTemperature {
	// field holds Fahrenheit temp
	private double ftemp;
	
	/*
	 * Constructor
	 * @param f Accepts fahrenheit temp as a double
	 */
	public CarpenterTemperature(double f) {
		ftemp = f;
	}
	
	/*
	 * The setFahrenheit method accepts a temp and stores it in the field
	 * @param fah sets the ftemp field 
	 */
	public void setFahrenheit(double fah) {
		ftemp = fah;
	}
	
	/*
	 * The getFahrenheit methods returns the value of ftemp field
	 * @return ftemp field
	 */
	public double getFahrenheit() {
		return ftemp;
	}
	
	/*
	 * The getCelsius method returns the value of ftemp converted
	 * to Celsius 
	 * Celsius = (5/9) * (Fahrenheit - 32)
	 * @return celsius converted ftemp field
	 */
	public double getCelsius() {
		return (5.0/9.0) * (ftemp - 32.0);
	}
	
	/*
	 * The getKelvin method returns the value of ftemp converted
	 * to Kelvin
	 * Kelvin = ((5/9) * (Fahrenheit - 32)) + 273
	 * @return kelvin converted ftemp field
	 */
	public double getKelvin() {
		return ((5.0/9.0) * (ftemp - 32.0)) + 273.0;
	}
	
	// main method
	public static void main(String[] args) {
		// create Scanner object
		Scanner keyboard = new Scanner(System.in);
		
		// get user input for temp in Fahrenheit
		System.out.print("Enter a Fahrenheit temperature:");
		// create Temperature object and pass the user input as the parameter
		CarpenterTemperature temp = new CarpenterTemperature(keyboard.nextDouble());
		
		System.out.println("The temperature in Fahrenheit is " + temp.getFahrenheit());
		System.out.println("The temperature in Celsius is " + temp.getCelsius());
		System.out.println("The temperature in Kelvin is " + temp.getKelvin());
		
		keyboard.close();
	}
}
