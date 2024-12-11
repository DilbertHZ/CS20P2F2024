/* Program: Palindrome.java          Last Date of this Revision: December 11, 2024

Purpose: An application that that checks if a word or phrase is a palindrome.

Author: Hunter Zahn, 
School: CHHS
Course: Computer Programming 20
*/


package Mastery;

import java.util.Collections;
import java.util.Scanner;
import java.util.ArrayList;

public class Palindrome {

	public static void main(String[] args) {
		
		//Creates letter ArrayList object
		ArrayList<Character> letter = new ArrayList<Character>();
		
		//Preparing for user input
		Scanner input = new Scanner(System.in);
		
		//Prompts and records user input
		System.out.print("Enter a word: ");
		String word = input.nextLine();
		
		//Converts to lowercase and removes spaces from the word/phrase
		word = word.toLowerCase();
		word = word.replaceAll(" ","");
		
		//Gets length of user input
		int length = word.length();
		
		//Loops for the number of characters in the word/phrase
		for(int i = 0; i < length; i++) {
			//Adds char from word/phrase to ArrayList
			letter.add(word.charAt(i));
		}
		
		//Creates a second ArrayList object and reverses it
		ArrayList<Character> reverseLetter = (ArrayList<Character>)letter.clone();
		Collections.reverse(reverseLetter);
		
		//Checks if both ArrayList objects are equal
		if (letter.equals(reverseLetter) == true) {
			//Prints object is a palindrome
			System.out.print(word + " IS a palindrome.");
		} else {
			//Prints object isn't a palindrome
			System.out.print(word + " is NOT a palindrome.");
		}
		

	}

}

/*Screen Dump



Case 1:
Enter a word: Never odd or even
neveroddoreven IS a palindrome.

Case 2:
Enter a word: Always even or odd
alwaysevenorodd is NOT a palindrome.

*/