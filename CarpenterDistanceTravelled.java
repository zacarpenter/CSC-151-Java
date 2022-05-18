// Author: Zachary Carpenter
// Date: 09/17/2021
// Purpose: To calculate the distance traveled based on user input

import java.util.Scanner;

public class CarpenterDistanceTravelled {
	public static void main(String[] args) {
		
		// create Scanner
		Scanner input = new Scanner(System.in);
		
		// get input for speed
		System.out.print("Enter vehicle speed (in mph): ");
		// store speed
		int speed = input.nextInt();
		
		// validate input
		while(speed < 0) {
			// get input for speed
			System.out.print("Enter vehicle speed (in mph): ");
			// store speed
			speed = input.nextInt();
		}
		
		// get input for time
		System.out.print("Enter time travelled (in hrs): ");
		// store time
		int time = input.nextInt();
		
		// validate input
		while(time < 1) {
			// get input for time
			System.out.print("Enter time travelled (in hrs): ");
			// store time
			time = input.nextInt();
		}
		
		// output
		System.out.println("Hour	Distance Travelled");
		System.out.println("--------------------------");
		
		
		// loop to output the distance traveled per the user's input
		for (int hour = 1; hour <= time; hour++) {
			// calculate distance
			int distance = speed * hour;
			
			// output
			System.out.println(hour + "		" + distance);
		}
		
		input.close();
	}
}

/* Revel Solution:
 
import java.util.Scanner;
public class DistanceTravelled {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int speed = -1, time = 0;
        while (speed < 0) {
            System.out.printf("Enter vehicle speed (in mph): ");
            speed = input.nextInt();
        }
        while (time < 1) {
            System.out.printf("Enter time travelled (in hrs): ");
            time = input.nextInt();
        }
        System.out.printf("Hour\tDistance Travelled%n"
                + "--------------------------%n");
        for (int i = 1; i <= time; i++)
            System.out.printf("%d\t\t%d%n", i, (speed * i));
        return;
    }
}
  
*/