/* Program: PerfectSquare.java          Last Date of this Revision: September 24, 2024

Purpose: An application that checks if a number is a perfect square or not

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
		
		//Square root the inputed number
		double root = Math.sqrt(num);
		
		//Square the number which was previously rooted, and record int value
		int square = (int)Math.pow((int)root, 2);
		
		//Checks if the squared number = inputed number, if it is equal then it is a perfect square
		if (num == square) {
			System.out.print(num + " Is a perfect square");
		} else {
			System.out.print(num + " Is not a perfect square");
		}
				
	}

}
