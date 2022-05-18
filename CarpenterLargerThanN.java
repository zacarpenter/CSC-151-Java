/* 	Author: Zachary Carpenter
	Date: 10/12/2021
 	Purpose: This program has a method that accepts two parameters:
 	an int array and an int. Then loops through the array and determines
 	if the array items are larger than the int passed.
*/
public class CarpenterLargerThanN {
	/**largerThanN loops through the array and compares if the items are larger
	 * than param n. It prints the items that are larger.
	 * @param myArray[] is an array of numbers
	 * @param n is the number value passed to compare the array to
	 */
	public void largerThanN(int myArray[], int n) {
		// loop through the array to determine if the index is larger than n
		for (int i = 0; i < myArray.length; i++) {
			// conditional to determine if the array index is larger than n
			if (myArray[i] > n) {
				// if the array item is larger than n, output
				System.out.printf("Index #%d: %d is larger than %d \n", 
						i,  myArray[i], n);
			}
		}
	}
	
	// main
	public static void main(String[] args) {
		
		// purpose of the program
		System.out.println("This program takes a set of numbers and"
				+ " loops through to determine if the numbers are larger"
				+ " than the comparison number provided.\n");
		
		// create object
		CarpenterLargerThanN larger = new CarpenterLargerThanN();
		
		// create variables to pass as parameters
		int array1[] = {1, 5, 10, 2, 4, -3, 6};
		int n1 = 3;
		int array2[] = {10, 12, 15, 24};
		int n2 = 12;
		
		System.out.println("First array of numbers:");
		// call largerThanN and pass the first array and number
		larger.largerThanN(array1, n1);
		
		System.out.println("\nSecond array of numbers:");
		// call largerThanN and pass the second array and number
		larger.largerThanN(array2, n2);
		
	}

}

/* Revel Solution
 * In a program, write a method that accepts two arguments: an array of integers 
 * and a number n. The method should print all of the numbers in the 
 * array that are greater than the number n 
 * (in the order that they appear in the array, each on their own line).
 *
 * In the same file, create a main method and call your function using the 
 * following data sets:
 *
 * The array {1, 5, 10, 2, 4, -3, 6} and the number 3.
 * The array {10, 12, 15, 24} and the number 12.
 *
 * public class LargerThanN {
	public static void largerThan(int[] nums, int n){
		for(int i=0; i<nums.length; i++){
			if (nums[i] > n){
					System.out.println(nums[i]);
			}
		}
	}
	
	public static void main(String args[]){
		int[] num1 = {1, 5, 10, 2, 4, -3, 6};
		int n1 = 3;
		
		int[] num2 = {10, 12, 15, 24};
		int n2 = 12;
		
		largerThan(num1, n1);
		largerThan(num2, n2);
	}
}
*/
