/* Program: SpanishNumbers.java          Last Date of this Revision: October 20, 2024

Purpose: An application that prints the Arabic numerals up to ten, and their written Spanish variant.

Author: Hunter Zahn, 
School: CHHS
Course: Computer Programming 20
*/

package SkillBuilders;

public class SpanishNumbers {

	public static void spanish(int num) {
		
		//Switch statements that prints the corresponding Spanish variant of the currently looping number
		switch(num) {
		case 1: System.out.print(" Uno");
		break;
		case 2: System.out.print(" Dos");
		break;
		case 3: System.out.print(" Tres");
		break;
		case 4: System.out.print(" Cuatro");
		break;
		case 5: System.out.print(" Cinco");
		break;
		case 6: System.out.print(" Seis");
		break;
		case 7: System.out.print(" Siete");
		break;
		case 8: System.out.print(" Ocho");
		break;
		case 9: System.out.print(" Nueve");
		break;
		case 10: System.out.print(" Diez");
		break;
		}
	}
	
	
	public static void main(String[] args) {
		
		//Declaration
		int num = 1;
		
		//Loops while number is less, or equal to 10
		while (num <= 10) {
			
			//Prints number in English
			System.out.println(num);
			
			//Calls spanish method
			spanish(num);
			
			//Increments number by 1
			num ++;
			
		}

	}
	

}
