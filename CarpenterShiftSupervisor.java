/* 	Author: Zachary Carpenter
	Date: 11/2/2021
 	Purpose: This class extends the CarpenterEmployee class.  
*/
import java.text.NumberFormat;
public class CarpenterShiftSupervisor extends CarpenterEmployee {
	// fields
	private double salary;
	private double bonus;
	
	/**
	 * Constructor sets the employee name, number, hire date, and salary.
	 * Calls the superclass constructor for name, number, and hire date.
	 * @param n is the employee's name
	 * @param num is the employee's number
	 * @param hd is the employee's start date
	 * @param s is the employee's salary
	 */
	public CarpenterShiftSupervisor(String n, String num, String hd,
			double s) {
		// call superclass constructor
		super(n, num, hd);
		
		salary = s;
	}
	
	/**
	 * No arg Constructor
	 * sets default data - uses default superclass constructor also
	 */
	public CarpenterShiftSupervisor() {
		// call superclass constructor with no params
		super();
		
		salary = 0.0;
		bonus = 0.0;
	}
	
	/**
	 * setSalary sets the value for the salary field
	 * @param s is the supervisor's salary
	 */
	public void setSalary(double s) {
		salary = s;
	}
	
	/**
	 * setBonus sets the value for the bonus field
	 * @param b is the supervisor's bonus
	 */
	public void setBonus(double b) {
		bonus = b;
	}

	/**
	 * getSalary returns the value for the salary field
	 * @return the supervisor's salary
	 */
	public double getSalary() {
		return salary;
	}
	
	/**
	 * getBonus returns the value for the bonus field
	 * @return the supervisor's bonus
	 */
	public double getBonus() {
		//bonus = 0.08; if the employees are on the same shift
		return bonus;
	}
	
	
	/**
	 * bonus calculates and additional 8% bonus of the salary if the employees
	 * are on the same shift
	 * @return the bonus calculation
	 */
	public double bonus() {
		double salaryBonus = salary * bonus;
		return salaryBonus;
	}
	
	/**
	 * toString method calls the superclass and prints all the supervisor data
	 * to the console.
	 * @return s the formatted string
	 */
	public String toString() {
		String s = "Shift Supervisor\n";
		
		// call the superclass toString method
		s += super.toString();
		
		// create NumberFormat object to format the bonus as a percentage
		NumberFormat percentFormat = NumberFormat.getPercentInstance();
		// set the decimal places
		percentFormat.setMinimumFractionDigits(1);
		
		/*
		 * if the bonus value is greater than 0, print the Supervisor's salary
		 * plus bonus
		 */
		if (bonus() > 0) {
			// format to the correct decimal place and add to the string
			s += "\nSupervisor Base Salary: " + String.format("$%.2f", 
					getSalary());
			s += "\nBonus: " + String.format("$%.2f", bonus());
			s += "\nSalary with Bonus: " + String.format("$%.2f", getSalary())  
					+ " * " + percentFormat.format(getBonus()) + " = ";
			/*
			 * call setSalary() setting the salary field as the 
			 * calculated bonus() plus the salary field value
			 */

			setSalary(bonus() + salary);
			// output the new salary field value
			s += String.format("$%.2f", getSalary()) ;
		}
		// otherwise, print the base salary and reason for no bonus
		else {
			s += "\nSupervisor Base Salary: " + String.format("$%2.f", 
					getSalary());
			s += "\nSupervisor did not earn a bonus for workers on the same"
					+ " shift.";
		}
		
		return s;
	}
	
}
