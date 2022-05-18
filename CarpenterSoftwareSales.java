// Author: Zachary Carpenter
// Date: 09/11/2021
// Purpose: To calculate the software sales based on user input

import java.util.Scanner;

public class CarpenterSoftwareSales {
	
	public static void main(String[] args) {
		// declare variables for storing values
		int qty;
		double discount;
		int retailPrice = 99;
		double total;
		
		// creating Scanner object
		Scanner keyboard = new Scanner(System.in);
		// gather user input
		System.out.print("Enter number of packages purchased: ");
		qty = keyboard.nextInt();
		
		if (qty >= 10 && qty <= 19) {
			total = qty * retailPrice;
			discount = (0.2 * total);
			System.out.format("Your discount is: $%.2f\n", discount);
			total -= discount;
			System.out.format("Your total is: $%.2f", total);
		}
		else if (qty >= 20 && qty <= 49) {
			total = qty * retailPrice;
			discount = (0.3 * total);
			System.out.format("Your discount is: $%.2f\n", discount);
			total -= discount;
			System.out.format("Your total is: $%.2f", total);
		}
		else if (qty >= 50 && qty <= 99) {
			total = qty * retailPrice;
			discount = (0.4 * total);
			System.out.format("Your discount is: $%.2f\n", discount);
			total -= discount;
			System.out.format("Your total is: $%.2f", total);
		}
		else if (qty >= 100) {
			total = qty * retailPrice;
			discount = (0.5 * total);
			System.out.format("Your discount is: $%.2f\n", discount);
			total -= discount;
			System.out.format("Your total is: $%.2f", total);
		}
		else {
			total = qty * retailPrice;
			discount = 0;
			System.out.format("Your discount is: $%.2f\n", discount);
			System.out.format("Your total is: $%.2f", total);
		}
		
		keyboard.close();
		
	}
	
}

/*
 * Revel provided Solution
 * import java.util.Scanner;
public class SoftwareSales {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		final double regPrice = 99.0;
		System.out.printf("Enter number of packages purchased: ");
		final int numPackages = input.nextInt();
		double discount = 0.0, total = regPrice * numPackages;
		if (numPackages <= 0) total = 0.0;
		else if ((numPackages >= 10) && (numPackages <= 19))
    		discount = (0.2 * total);
		else if ((numPackages >= 20) && (numPackages <= 49))
    		discount = (0.3 * total);
		else if ((numPackages >= 50) && (numPackages <= 99))
    		discount = (0.4 * total);
		else if (numPackages >= 100)
    		discount = (0.5 * total);
		System.out.printf("Your discount is: $%.2f%n" + "Your total is: $%.2f%n",
        	discount, total - discount);
        	return;
	}
}
 */
