/* 	Author: Zachary Carpenter
	Date: 09/29/2021
 	Purpose: create a class called Car with fields
 	yearModel, make, speed
 	creates an object from Car and calls its methods
*/

public class CarpenterCar {

	// fields
	private int yearModel;
	private String make;
	private int speed;
	
	/*
	 * Constructor
	 * @param ym Accepts the car year model
	 * @param m Accepts the car make
	 * also assigns speed to 0
	 */
	public CarpenterCar(int ym, String m) {
		yearModel = ym;
		make = m;
		speed = 0;
	}
	
	/* Accessors
	 * The getYearModel returns the car's yearModel
	 * @return yearModel int
	 */
	public int getYearModel() {
		return yearModel;
	}
	
	/*
	 * The getMake returns the car's make
	 * @return make string
	 */
	public String getMake() {
		return make;
	}
	
	/*
	 * The getSpeed returns the car's speed
	 * @return speed int
	 */
	public int getSpeed() {
		return speed;
	}
	
	/*
	 * The accelerate method increase the speed of the car
	 */
	public void accelerate() {
		speed += 5;
	}
	
	/*
	 * The brake method decreases the speed of the car
	 */
	public void brake() {
		speed -= 5;
	}
	
	// main method
	public static void main(String[] args) {
		// create Car object
		CarpenterCar car = new CarpenterCar(2016, "Mazda");
		
		// call the accelerate method and print 5 times
		car.accelerate();
		System.out.println(car.getSpeed());
		car.accelerate();
		System.out.println(car.getSpeed());
		car.accelerate();
		System.out.println(car.getSpeed());
		car.accelerate();
		System.out.println(car.getSpeed());
		car.accelerate();
		System.out.println(car.getSpeed());
		
		// could have used a loop for this also
		/*
		 * for(int i=0; i<5; i++){
			batmobile.accelerate();
			System.out.println(batmobile.getSpeed());
		   }
		 */
		
		// call the brake method and print 5 times
		car.brake();
		System.out.println(car.getSpeed());
		car.brake();
		System.out.println(car.getSpeed());
		car.brake();
		System.out.println(car.getSpeed());
		car.brake();
		System.out.println(car.getSpeed());
		car.brake();
		System.out.println(car.getSpeed());
	}
}
