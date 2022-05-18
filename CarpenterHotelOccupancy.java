// Author: Zachary Carpenter
// Date: 09/19/2021
// Purpose: To calculate the hotel occupancy

// Occupancy rate = Number of rooms occupied / total number of rooms

import java.util.Scanner;
public class CarpenterHotelOccupancy {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		// Input validation: do not accept a value less that 1 for the number of floors.
		// do not accept a number less than 10 for the number of rooms on a floor.
		
		// initialize the variables needed
		int floors = 0, roomsOccupied = 0;
		double rooms = 0, totalRooms = 0, totalRoomsOccupied = 0, vacantRooms = 0, occupancyRate = 0.0;
		
		// floors is initialized to 0 so we have to enter this loop at least once
		while (floors < 1) {
			// get input for floors
			System.out.print("Enter number of floors: ");
			floors = keyboard.nextInt();
		} // end floor while
		
		// loop to iterate for each floor
		for (int r = 0; r <  floors; r++) {
			
			// get input for rooms
			System.out.printf("Enter number of rooms on floor %x: ", (r +1));
			rooms = keyboard.nextInt();
			
			// ensure rooms is not less than 10
			while (rooms < 10) {
				System.out.printf("Enter number of rooms on floor %x, must be greater than 9: ", (r +1));
				rooms = keyboard.nextInt();
			}
			
			// get input for rooms occupied
			System.out.printf("Enter the number of rooms occupied on floor %x: ", (r+ 1));
			roomsOccupied = keyboard.nextInt();
			
			// calculate total rooms each time through the loop
			totalRooms += rooms;
			
			// calculate total rooms occupied each time through the loop
			totalRoomsOccupied += roomsOccupied;
			
		} // end floor for
		
		// calculate the number of vacant rooms
		vacantRooms = totalRooms - totalRoomsOccupied;
		
		// calculate the occupancy rate
		occupancyRate = totalRoomsOccupied / totalRooms;
		
		// output the results, format the occupancy rate percentage
		System.out.println("Total rooms: " + totalRooms + "\nRooms Occupied: " + totalRoomsOccupied +
				"\nVacant Rooms: " + vacantRooms + "\nOccupancy Rate: " + (occupancyRate * 100) +"%");
	
		keyboard.close();
	} // end main

} // end class
