package SkillBuilders;

import java.util.Scanner;

public class StudentRoster {

	public static void main(String[] args) {
		
		//Preparing for user input
		Scanner userInput = new Scanner(System.in);
		
		String[] roster;
		
		//Prompt user input
		System.out.print("Enter number students in the class: ");
		int rosterSize;
		rosterSize = userInput.nextInt();
		
		//Additional userInput, not sure why this needs to be here but without it element 0 of the array returns null
		userInput.nextLine();
		
		//Allocate array
		roster = new String[rosterSize];
		
		//Loops while the count is less than the rosterSize, initializes each element of the array.
		for (int count = 0; count < rosterSize; count ++) {
			System.out.print("Enter student " + (count + 1) + " name: ");
			roster[count] = userInput.nextLine();
		}
		
		//Prints roster title
		System.out.print("Student Roster: ");
		
		//For-each loop that prints the roster
		for (String element: roster) {
			System.out.print(element + " ");
		}
	}

}
