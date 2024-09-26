/* Program: QuadraticEquations.java          Last Date of this Revision: September 26, 2024

Purpose: An application that gives the solution to any quadratic equation.

Author: Hunter Zahn, 
School: CHHS
Course: Computer Programming 20
*/

package Mastery;

import java.util.Scanner;

public class QuadraticEquations {

	public static void main(String[] args) {
		
		//Preparing for user input
		Scanner userInput = new Scanner(System.in);

		//Prompt and record the user for a
		System.out.print("Enter value for a: ");
		double a = userInput.nextDouble();		

		//Prompt and record the user for b
		System.out.print("Enter value for b: ");
		double b = userInput.nextDouble();		
				
		//Prompt and record the user for c
		System.out.print("Enter value for c: ");
		double c = userInput.nextDouble();		
		
		//Calculates the neg, and pos roots
		double ansPos = (-b + Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a);
		double ansNeg = (-b - Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a);
		
		//Displays the roots 
		System.out.print("The roots are " + ansPos + " and " + ansNeg);
	}

}

/*Screen Dump

Test Case 1:
Enter value for a: 2
Enter value for b: 4
Enter value for c: -30
The roots are 3.0 and -5.0

Test Case 2:
Enter value for a: -4
Enter value for b: -2
Enter value for c: 30
The roots are -3.0 and 2.5

Test Case 3:
Enter value for a: 1
Enter value for b: 2
Enter value for c: 3
The roots are NaN and NaN

*/
