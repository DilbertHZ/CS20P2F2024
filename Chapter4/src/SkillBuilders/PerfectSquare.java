/* Program: Delivery.java          Last Date of this Revision: September 23, 2024

Purpose: An application that checks if all of the provided dimensions are less than 10

Author: Hunter Zahn, 
School: CHHS
Course: Computer Programming 20
*/

package SkillBuilders;

import java.util.Scanner;

public class PerfectSquare {

	public static void main(String[] args) {

		//Preparing for user input
		Scanner userInput = new Scanner(System.in);

		//Prompt and record user input
		System.out.print("Enter whole number: ");
		int num = userInput.nextInt();
		
		//Square root inputed number
		double root = Math.sqrt(num);
		
		//
		int square = (int)Math.pow((int)root, 2);
		
		if (num == square) {
			System.out.print(num + " Is a perfect square");
		} else {
			System.out.print(num + " Is not a perfect square");
		}
				
	}

}
