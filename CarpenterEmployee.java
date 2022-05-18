/* 	Author: Zachary Carpenter
	Date: 11/2/2021
 	Purpose: This class has setters and getters for the employee name, employee
 	number, and hire date fields. As well as validates the input for the 
 	employee number field.
*/
public class CarpenterEmployee {
	// fields
	private String employeeName;
	private String employeeNumber;
	private String hireDate;
	
	/**
	 * Constructor
	 * @param name is the employee's name
	 * @param number is the employee's number in format XXX-L (X digit - 0-9)
	 * (L letter - A-M)
	 * @param hDate is the employee's hire date
	 */
	public CarpenterEmployee(String name, String number, String hDate) {
		employeeName = name;
		// if the format is correct, set it to the parameter passed
		if (isValidEmpNum(number)) {
			employeeNumber = number;
		}
		else {
			// set the employee number to a blank string if the format is wrong
			employeeNumber = "";
		}
		hireDate = hDate;
	}
	
	/**
	 * No arg Constructor
	 * sets default data
	 */
	public CarpenterEmployee() {
		employeeName = "";
		employeeNumber = "";
		hireDate = "";
	}
	
	/**
	 * Setter for employeeName
	 * @param n is the employee's name
	 */
	public void setName(String n) {
		employeeName = n;
	}
	
	/**
	 * Setter for employeeNumber
	 * @param num is the employee's number
	 */
	public void setNumber(String num) {
		// if the format is correct, set it to the parameter passed
		if (isValidEmpNum(num)) {
			employeeNumber = num;
		}
		else {
			// set the employee number to a blank string if the format is wrong
			employeeNumber = "";
		}
	}
	
	/**
	 * Setter for hire date
	 * @param d is the employee's hire date
	 */
	public void setHireDate(String d) {
		hireDate = d;
	}
	
	
	/**
	 * Getter for the employee name - returns the employeeName field
	 * @return employeeName is the employee's name value
	 */
	public String getName() {
		return employeeName;
	}
	
	/**
	 * Getter for the employee number - returns the employeeNumber field
	 * @return employeeNumber is the employee's number value
	 */
	public String getEmpNum() {
		return employeeNumber;
	}
	
	/**
	 * Getter for the hire date - returns the hireDate field
	 * @return hireDate is the employee's hire date value
	 */
	public String getHireDate() {
		return hireDate;
	}
 	
	
	/**
	 * isValidEmpNum checks if the employee number is in the correct format
	 * @param e is the employee number string
	 * @return isValid boolean whether the string is formatted properly
	 * XXX-L = (X digit - 0-9) (L letter - A-M)
	 */
	private boolean isValidEmpNum(String e) {
		// initialize our valid boolean
		boolean isValid = true;
		
		// check if the employee number is the correct length first
		if (e.length() != 5) {
			isValid = false;
		}
		else {
			/* check if the first 3 digits are numbers
			 * the 4 digit is a hyphen
			 * and the last digit is a letter between A-M
			 */
			if ( (!Character.isDigit(e.charAt(0)))
				|| (!Character.isDigit(e.charAt(1)))
				|| (!Character.isDigit(e.charAt(2)))
				|| ((e.charAt(3) != '-') 
				|| (!Character.isLetter(e.charAt(4)))
				|| (!(e.charAt(4) >= 'A' && e.charAt(4) <= 'M'))) ) {
					
				isValid = false;
			}
				
		}
		return isValid;
	}
	
	/**
	 * toString formats the output to the console
	 * @return s the formatted string
	 */
	public String toString() {
		String s = "Employee name: " + getName() + "\nEmployee number: ";
		
		if (getEmpNum() == "") {
			s += "Invalid Employee Number";
		}
		else {
			s += getEmpNum();
		}
		
		s += "\nHire date: " + getHireDate();
		
		return s;
	}
	
}
