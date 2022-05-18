/* 	Author: Zachary Carpenter
	Date: 10/20/2021
 	Purpose: This program gets user input for two LandTract objects. Using the
 	input it calculates the area, prints a formatted string, and determines if
 	the dimensions entered are equal.
*/
import java.util.Scanner;
public class CarpenterLandTract {
	
	// fields
	private int length;
	private int width;
	
	/**constructor
	 * @param the tract's length
	 * @param the tract's width
	 */
	public CarpenterLandTract(int len, int wid) {
		length = len;
		width = wid;
	}
	
	/**area method returns the area
	 * @return area calculation 
	 */
	public int area() {
		return length * width;
	}
	
	/**equals method checks if two objects have the same values
	 * @param LandTract object2 
	 * @return status boolean, true if the two objects have the same values
	 */
	public boolean equals(CarpenterLandTract object2) {
		boolean status = false; // initialize status to false
		// if dimensions are equal, set status to true
		if ((length == object2.length || length == object2.width) && 
				(width == object2.width || width == object2.length)) {
			status = true;
		}
		return status;
	}
	
	/**toString method returns a string with the length, width, and calls the
	 * area() method to calculate the area.
	 * @param x is the number of the LandTract object
	 * @return a string with details about the LandTract object
	 */
	public String toString(String x) {
		String str = "The " + x + " land tract " + "has a length of " + length 
				+ " ft" + ", a width " + "of " + width + " ft" +
				", and an area of " + area() + " sqft."; // call area()
		return str;
	}
	
	// main
	public static void main(String[] args) {
		// create Scanner object
		Scanner kbd = new Scanner(System.in);
		
		// purpose
		System.out.println("This program asks users to input the size of a"
				+ " land tract. Using the sizes entered it calculates the"
				+ " area and prints the results.\n"
				+ "Additionally, it determines if the dimensions entered"
				+ " are the same for the two land tracts.\n\n");
		
		// gets user input for the first land tract
		System.out.print("Enter length of first land tract:");
		int len1 = kbd.nextInt();
		System.out.print("Enter width of first land tract:");
		int wid1 = kbd.nextInt();
		
		// create first LandTract object
		CarpenterLandTract landTract1 = new CarpenterLandTract(len1, wid1);
		
		// get user input for the second land tract
		System.out.print("Enter length of second land tract:");
		int len2 = kbd.nextInt();
		System.out.print("Enter width of second land tract:");
		int wid2 = kbd.nextInt();
		
		// create second LandTract object
		CarpenterLandTract landTract2 = new CarpenterLandTract(len2, wid2);
		
		System.out.println();
		
		// print the land tract objects using the toString() override method
		System.out.println(landTract1.toString("first"));
		System.out.println(landTract2.toString("second"));
		
		
		/* call the equals() method and print whether the two objects are the
		 * same size or not
		 */
		if (landTract1.equals(landTract2)) {
			System.out.println("The two tracts have the same size.");
		}
		else {
			System.out.println("The two tracts do not have the same size.");
		}
		
		// close Scanner
		kbd.close();
	}
}

/* Revel Solution
import java.util.Scanner;
public class LandTract {
	public static void main(String args[]){
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter length of first land tract:");
		int len1 = scanner.nextInt();
		System.out.print("Enter width of first land tract:");
		int wid1 = scanner.nextInt();
		
		System.out.print("Enter length of second land tract:");
		int len2 = scanner.nextInt();
		System.out.print("Enter width of second land tract:");
		int wid2 = scanner.nextInt();
		
		LandTract lt1 = new LandTract(len1, wid1);
		LandTract lt2 = new LandTract(len2, wid2);
		System.out.println(lt1.toString());
		System.out.println(lt2.toString());
		
		if(lt1.equals(lt2)){
			System.out.println("The two tracts have the same size.");
		}else{
			System.out.println("The two tracts do not have the same size.");
		}
		
	}
	private int length;
	private int width;
	
	public LandTract(int l, int w){
		this.length = l;
		this.width = w;
	}
	
	public int area() {
		return this.length*this.width;
	}
	
	public String toString() {
		return "LandTract with length " + this.length + ", width " + this.width
				+ ", and area " + this.area();
	}
	
	public boolean equals(LandTract other){
		return(this.length == other.length && this.width == other.width || this.length == other.width && other.length == this.width);
	}
}
*/
