/* Program: RandomNum.java          Last Date of this Revision: September 23, 2024

Purpose: An application that calculates a random int between a min and max value

Author: Hunter Zahn, 
School: CHHS
Course: Computer Programming 20
*/

package SkillBuilders;

import java.util.Scanner;

public class RandomNum {

	public static void main(String[] args) {
		
		//Preparing for user input
		Scanner userInput = new Scanner(System.in);
		
		//Prompt and record user input
		System.out.print("Please enter minimum value: ");
		int min = userInput.nextInt();
		System.out.print("Please enter maximum value: ");
		int max = userInput.nextInt();
		
		//Calculates the random number
		System.out.print("Number: " + (int)((max - min + 1) * Math.random() + min));
	}

}
