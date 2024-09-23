/* Program: Hurricane.java          Last Date of this Revision: September 23, 2024

Purpose: An application that displays hurricane wind speeds based off of desired category level

Author: Hunter Zahn, 
School: CHHS
Course: Computer Programming 20
*/

package SkillBuilders;

import java.util.Scanner;

public class Hurricane {

	public static void main(String[] args) {
		
		//Preparing for user input
		Scanner userInput = new Scanner(System.in);
		
		//Prompt and record user input
		System.out.print("Please enter desired category on the Saffir-Simpson Hurricane Scale (1-5): ");
		 int category = userInput.nextInt();
		
		//Display category information based off of inputed level 
		switch(category) {
		case 1: System.out.print("Category 1: 74-95 mph or 64-82 kt or 119-153 hm/h");
			break;
		case 2: System.out.print("Category 2: 96-110 mph or 83-95 kt or 154-177 hm/h");
			break;
		case 3: System.out.print("Category 3: 111-130 mph or 96-113 kt or 178-209 hm/h");
			break;
		case 4: System.out.print("Category 4: 131-155 mph or 114-135 kt or 210-249 hm/h");
			break;
		case 5: System.out.print("Category 5: greater than 155 mph or 135 kt or 249 km/h");
			break;
		default: System.out.print("Invalid level. Categories range from 1 - 5");
		}
	}

}
