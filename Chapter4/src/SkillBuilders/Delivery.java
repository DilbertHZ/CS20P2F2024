/* Program: Delivery.java          Last Date of this Revision: September 23, 2024

Purpose: An application that checks if all of the provided dimensions are less than 10

Author: Hunter Zahn, 
School: CHHS
Course: Computer Programming 20
*/

package SkillBuilders;

import java.util.Scanner;

public class Delivery {

	public static void main(String[] args) {
		
		//Preparing for user input
		Scanner userInput = new Scanner(System.in);
		
		//Prompt and record user input
		System.out.print("Please enter the length: ");
		int len = userInput.nextInt();
		System.out.print("Please enter the width: ");
		int wid = userInput.nextInt();
		System.out.print("Please enter the height: ");
		int hei = userInput.nextInt();
		
		//Checks if dimensions are valid, and prints accordingly 
		if (len > 10 || wid > 10 || hei > 10) {
			//Dimensions are invalid
			System.out.print("Reject. Dimensions must be less than 10");
		} else {
			//Dimensions are valid
			System.out.print("Accepted");
		}

	}

}
