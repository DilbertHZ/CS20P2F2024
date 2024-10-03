/* Program: Evens.java          Last Date of this Revision: October 3, 2024

Purpose: An application that displays the even numbers between 1 and 20.

Author: Hunter Zahn, 
School: CHHS
Course: Computer Programming 20
*/

package SkillBuilders;

public class Evens {

	public static void main(String[] args) {
		
		int number = 1;
		while (number <= 20) {
			if (number % 2 == 0) {
				System.out.println(number);
				number++;
			}
			else {
				number++;
			}
		}
		
		
	}

}
