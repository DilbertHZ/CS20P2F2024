/* Program: Evens.java          Last Date of this Revision: October 3, 2024

Purpose: An application that displays the even numbers between 1 and 20.

Author: Hunter Zahn, 
School: CHHS
Course: Computer Programming 20
*/

package SkillBuilders;

public class Evens {

	public static void main(String[] args) {
		
		//Declaration
		int number = 1;
		
		//Loops while number is less than or equal to 20
		while (number <= 20) {
			
			//Checks if the number is even
			if (number % 2 == 0) {
				//Prints the number
				System.out.println(number);
				//Increments by 1
				number++;
			}
			else {
				//Increments by 1
				number++;
			}
		}
		
		
	}

}
