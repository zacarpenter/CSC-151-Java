/* 	Author: Zachary Carpenter
	Date: 11/2/2021
 	Purpose: This class extends the CarpenterEmployee class. It has setters and
 	getters for the shift and hourly rate fields. 
*/
public class CarpenterProductionWorker extends CarpenterEmployee {
	// fields
	private int shift; // 1 = Day Shift or 2 = Night Shift
	private double hourlyRate;
	
	/**
	 * Constructor sets the employee name, number, hire date, shift, and hourly
	 * rate. Calls the superclass constructor for name, number, and hire date.
	 * @param n is the employee's name
	 * @param num is the employee's number
	 * @param h is the employee's hire date
	 * @param s is the shift number
	 * @param hr is the hourly rate for the employee
	 */
	public CarpenterProductionWorker(String n, String num, String h, int s, 
			double hr) {
		// call the superclass constructor
		super(n, num, h);
		
		shift = s;
		hourlyRate = hr;
	}
	
	/**
	 * No arg Constructor
	 * sets default data - uses default superclass constructor also
	 */
	public CarpenterProductionWorker() {
		super();
		shift = 0;
		hourlyRate = 0.0;
	}
	
	
	/**
	 * Setter for the shift number
	 * @param s is the shift number represented by an int
	 */
	public void setShift(int s) {
		shift = s;
	}
	
	/**
	 * Setter for the employee's hourly rate
	 * @param r is the hourly rate
	 */
	public void setHourlyRate(double r) {
		hourlyRate = r;
	}
	
	/**
	 * Getter for the shift number
	 * @return the shift number
	 */
	public int getShift() {
		return shift;
	}
	
	/**
	 * Getter for the hourly rate
	 * @return the employee's hourly rate
	 */
	public double getHourlyRate() {
		return hourlyRate;
	}
	
	
	/**
	 * toString method calls the superclass and prints all the employee data to
	 * the console.
	 * @return s the formatted string
	 */
	public String toString() {
		String s = "Production Worker\n";
		
		// call superclass toString method
		s += super.toString();
		
		s += "\nShift: ";
		// call getShift, if the value is 1 print Day Shift
		if (getShift() == 1) {
			s += "Day Shift";
		}
		// if the value is 2 print Night Shift
		else if (getShift() == 2) {
			s += "Night Shift";
		}
		else {
			s += "Invalid Shift Number";
		}
		
		// format the hourly rate ex. $15.00
		s += "\nHourly Pay Rate: " + String.format("$%.2f", getHourlyRate()) 
			+ "\n";
		
		return s;
	}
}
