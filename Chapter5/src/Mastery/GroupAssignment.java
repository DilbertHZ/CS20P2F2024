/* Program: GroupAssignment.java          Last Date of this Revision: October 9, 2024

Purpose: An application that displays the inputed users designated group, which is decided off of their last name.

Author: Hunter Zahn, 
School: CHHS
Course: Computer Programming 20
*/

package Mastery;

import java.util.Scanner;

public class GroupAssignment {

	public static void main(String[] args) {
		
		//Preparing for user input
		Scanner userInput = new Scanner(System.in);
		
		//Prompt and record user input
		System.out.print("Enter your first name: ");
		String firstName = userInput.nextLine();
		System.out.print("Enter your last name: ");
		String lastName = userInput.nextLine();
		
		//Declaration
		char letter = (lastName.toLowerCase()).charAt(0);
		
		char minGroup1 = 'a';
		char maxGroup1 = 'i';
		
		char minGroup2 = 'j';
		char maxGroup2 = 's';
		
		char minGroup3 = 't';
		char maxGroup3 = 'z';
		
		//Checks if the first letter of their last name is within each groups parameters. 
		if (minGroup1 <= letter && letter <= maxGroup1) 
			System.out.println(firstName + " " + lastName + " is assigned to Group 1");
		else if (minGroup2 <= letter && letter <= maxGroup2) 
			System.out.println(firstName + " " + lastName + " is assigned to Group 2");
		else if (minGroup3 <= letter && letter <= maxGroup3)
			System.out.println(firstName + " " + lastName + " is assigned to Group 3");
		
	}

}
