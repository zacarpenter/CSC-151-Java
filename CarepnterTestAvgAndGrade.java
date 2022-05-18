// Author: Zachary Carpenter
// Date: 09/24/2021
// Purpose: asks the user to enter 5 scores
// 			displays a letter grade for each score
// 			and the average test score

import java.util.Scanner;

public class CarepnterTestAvgAndGrade {

	public static void main(String[] args) {
		// create Scanner object
		Scanner keyboard = new Scanner(System.in);
		
		// create variables to store student grades
		int student1, student2, student3, student4, student5;
		
		// gather student grade input
		System.out.printf("Enter test grade for student 1:");
		student1 = keyboard.nextInt();
		
		System.out.printf("Enter test grade for student 2:");
		student2 = keyboard.nextInt();
		
		System.out.printf("Enter test grade for student 3:");
		student3 = keyboard.nextInt();
		
		System.out.printf("Enter test grade for student 4:");
		student4 = keyboard.nextInt();
		
		System.out.printf("Enter test grade for student 5:");
		student5 = keyboard.nextInt();
		
		// output
		System.out.println("The letter grades are as follows:");
		
		// print student letter grade
		System.out.printf("Student 1: %c\n", determineGrade(student1));
		System.out.printf("Student 2: %c\n", determineGrade(student2));
		System.out.printf("Student 3: %c\n", determineGrade(student3));
		System.out.printf("Student 4: %c\n", determineGrade(student4));
		System.out.printf("Student 5: %c\n", determineGrade(student5));
		
		// print the average grade
		System.out.printf("The average grade was: %.2f", calcAverage(student1, student2, student3, student4, student5));
		
		keyboard.close();
	}
	
	/* method calcAverage accepts 5 parameters and returns the average
	 * @param score1 score argument from user
	 * @param score2 score argument from user
	 * @param score3 score argument from user
	 * @param score4 score argument from user
	 * @param score5 score argument from user
	*/
	public static double calcAverage(int score1, int score2, int score3, int score4, int score5) {
		// calculate the average of the score arguments
		double average = (score1 + score2 + score3 + score4 + score5) / 5.0;
		
		// @return the average score
		return average;
	}
	
	/* determineGrade performs a conditional to determine the letter grade based on score passed
	 * @param score A score entered by the user
	 */
	public static char determineGrade(int score) {
		// create a local variable letterGrade
		char letterGrade;
		
		//conditional to determine the letter grade based off the score arg
		if (score >= 90) {
			letterGrade = 'A';
		}
		else if (score >= 80) {
			letterGrade = 'B';
		}
		else if (score >= 70) {
			letterGrade = 'C';
		}
		else if (score >= 60) {
			letterGrade = 'D';
		}
		else {
			letterGrade = 'F';
		}
		
		// @return the letterGrade character
		return letterGrade;
	}
}



/* Revel Solution:
 * 
import java.util.Scanner;
public class TestAvgAndGrade {
    public static String determineGrade(int grade) {
        String letter = null;
        if (grade < 60)
            letter = "F";
        else if (grade <= 69)
            letter = "D";
        else if (grade <= 79)
            letter = "C";
        else if (grade <= 89)
            letter = "B";
        else if (grade <= 100)
            letter = "A";
        return letter;
    }
    public static double calcAverage(
            int g1,
            int g2,
            int g3,
            int g4,
            int g5) {
        return ((g1 + g2 + g3 + g4 + g5) / 5.0);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter test grade for student 1: ");
        int g1 = input.nextInt();
        System.out.printf("Enter test grade for student 2: ");
        int g2 = input.nextInt();
        System.out.printf("Enter test grade for student 3: ");
        int g3 = input.nextInt();
        System.out.printf("Enter test grade for student 4: ");
        int g4 = input.nextInt();
        System.out.printf("Enter test grade for student 5: ");
        int g5 = input.nextInt();
        double avg = calcAverage(g1, g2, g3, g4, g5);
        System.out.printf("The letter grades are as follows:%n"
                + "Student 1: %s%nStudent 2: %s%nStudent 3: %s%n"
                + "Student 4: %s%nStudent 5: %s%n"
                + "The average grade was: %.2f%n",
                determineGrade(g1),determineGrade(g2),
                determineGrade(g3), determineGrade(g4),
                determineGrade(g5), avg);
        return;
    }
}
 * 
 */
