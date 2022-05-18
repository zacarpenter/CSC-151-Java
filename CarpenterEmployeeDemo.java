/* 	Author: Zachary Carpenter
	Date: 11/3/2021
 	Purpose: This program creates a production worker and shift supervisor
 	using the constructors with hard coded arguments. It also asks a user for
 	input to create the last production worker. Finally, displays all three
 	employees to the console.
*/
import java.util.Scanner;
public class CarpenterEmployeeDemo {

	public static void main(String[] args) {
		
		// purpose
		System.out.println("This program displays information about "
				+ "a production worker and a shift supervisor.\n"
				+ "Additionally, it asks the user for input about one of the"
				+ " production workers and displays the info provided.\n");
		
		// create Scanner object
		Scanner kbd = new Scanner(System.in);
		
		// create a production worker using the 5 arg constructor
		CarpenterProductionWorker jeff = new CarpenterProductionWorker(
				"Jeff Smith", "123-J", "08-12-2015", 1, 21.50);
		
		
		// create the second production worker using the no-arg constructor
		CarpenterProductionWorker employee2 = new CarpenterProductionWorker();
		
		// ask for the production worker's info
		System.out.print("Enter the production worker's name: ");
		String name = kbd.nextLine();
		
		System.out.print("Enter the production worker's ID number: ");
		String num = kbd.nextLine();
		
		System.out.print("Enter the production worker's hire date: ");
		String date = kbd.nextLine();
		
		System.out.print("Enter the production worker's shift number (Day"
				+ " Shift = 1 and Night Shift = 2): ");
		int shift = kbd.nextInt();
		
		System.out.print("Enter the production worker's hourly rate: ");
		double rate = kbd.nextDouble();
		
		// call setters to set the production worker's info
		employee2.setName(name);
		employee2.setNumber(num);
		employee2.setHireDate(date);
		employee2.setShift(shift);
		employee2.setHourlyRate(rate);
		
		
		// create a shift supervisor using the 4 arg constructor
		CarpenterShiftSupervisor zac = new CarpenterShiftSupervisor(
				"Zac Carpenter", "342-M", "2-19-2018", 78412.13);
		
		/* call setter and pass bonus value
		 * if the production workers are on the same shift, set to 8%
		*/
		if (jeff.getShift() == employee2.getShift()) {
			zac.setBonus(0.08);
		}
		else {
			zac.setBonus(0.0);
		}
		
		System.out.println();
		
		// print the first production worker info to the console
		System.out.println(jeff.toString());
		
		System.out.println();
		
		// print the second production worker info to console
		System.out.println(employee2.toString());
		
		System.out.println();
		
		// print the shift supervisor to the console
		System.out.println(zac.toString());
		
		
		// close resource
		kbd.close();
	}
}