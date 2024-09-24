/* Program: MathTutor.java          Last Date of this Revision: September 24, 2024

Purpose: An application that functions as a math tutor that will give random problems

Author: Hunter Zahn, 
School: CHHS
Course: Computer Programming 20
*/

package Mastery;

import java.util.Scanner;

public class MathTutor {

	public static void main(String[] args) {
		
		//Preparing for user input
		Scanner userInput = new Scanner(System.in);
		
		//Calculates both random numbers
		int num1 = (int)((10 - 1 + 1) * Math.random() + 1);
		int num2 = (int)((10 - 1 + 1) * Math.random() + 1);
		
		//Calculates random operator
		int rand = (int)((4 - 1 + 1) * Math.random() + 1);
		
		//Decides on operator 
		if (rand == 1) {
			//Calculates the answer for addition 
			double ans = (num1 + num2);
			//Prints equation and prompts for user input
			System.out.print(num1 + " + " + num2 + " : ");
			//Records user input
			double user = userInput.nextInt();
			//Checks if user input = correct answer
			if (user == ans) {
				//Prints if correct
				System.out.print("Correct!");
			} else {
				//Prints if incorrect
				System.out.print("Incorrect, the correct answer was " + ans);
			}
		} else if (rand == 2) {
			//Calculates the answer for subtraction 
			double ans = (num1 - num2);
			System.out.print(num1 + " - " + num2 + " : ");
			double user = userInput.nextInt();
			if (user == ans) {
				System.out.print("Correct!");
			} else {
				System.out.print("Incorrect, the correct answer was " + ans);
			}
		} else if (rand == 3) {
			//Calculates the answer for multiplication 
			double ans = (num1 * num2);
			System.out.print(num1 + " * " + num2 + " : ");
			double user = userInput.nextInt();
			if (user == ans) {
				System.out.print("Correct!");
			} else {
				System.out.print("Incorrect, the correct answer was " + ans);
			}
		} else if (rand == 4) {
			//Calculates the answer for division 
			double ans = ((double) num1 / num2);
			System.out.print(num1 + " / " + num2 + " : ");
			double user = userInput.nextDouble();
			if (user == ans) {
				System.out.print("Correct!");
		} else {
			System.out.print("Incorrect, the correct answer was " + ans);
		}

	}

	}
}

/*Screen Dump

Test Case 1:
8 + 6 : 100
Incorrect, the correct answer was 14.0

Test Case 2:
2 - 10 : -8
Correct!

Test Case 3:
10 * 1 : 100
Incorrect, the correct answer was 10.0

Test Case 4:
4 / 5 : 0.8
Correct!

*/