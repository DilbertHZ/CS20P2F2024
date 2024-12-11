/* Program: EvensAndOdds.java          Last Date of this Revision: December 11, 2024

Purpose: An application that that generates 25 random integers and sorts them based on if they are even or odd.

Author: Hunter Zahn, 
School: CHHS
Course: Computer Programming 20
*/

package Mastery;

import java.util.ArrayList;

public class EvensAndOdds {
	public static void main(String[] args) {
		
		//Creates oddNum and evenNum ArrayList objects
		ArrayList<Integer> oddNum = new ArrayList<Integer>();
		ArrayList<Integer> evenNum = new ArrayList<Integer>();
		
		//Loops 25 times
		for (int i = 0; i < 25; i++) {
			//Generates number between 99 and 0
			int num = (int)((99 - 0 + 1) * Math.random() + 1);
			//Checks if number is odd or even
			if (num  % 2 == 0) {
				//Adds even number to evenNum object
				evenNum.add(num);
			} else {
				//Adds odd number to oddNum object
				oddNum.add(num);
			}
			
		}
	
		//Prints oddNum object
		System.out.println("ODD:\n" + oddNum);
		//Prints evenNum object
		System.out.print("EVEN:\n" + evenNum);
		
	}
	
}

/*Screen Dump

ODD:
[57, 1, 91, 3, 37, 81, 49, 67, 71, 19]
EVEN:
[80, 30, 94, 84, 72, 48, 30, 46, 36, 34, 52, 16, 58, 98, 62]

*/