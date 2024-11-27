package Mastery;

import java.util.Scanner;

public class TestMySavings {
	
	public static int x;
	
	public static void main(String[] args) { 
		TestMySavings myObj = new TestMySavings();
		  
			do {
				Scanner userInput = new Scanner(System.in);
				myObj.x = userInput.nextInt();

				//Prompt user for input
				System.out.println("1. Show total in bank.");
				System.out.println("2. Add a penny.");
				System.out.println("3. Add a nickel.");
				System.out.println("4. Add a dime.");
				System.out.println("5. Add a quarter.");
				System.out.println("6. Take money out of bank.");
				System.out.println("Enter 0 to quit.");
				System.out.println("Enter your choice: ");
				
			} while (myObj.x != 0);
			
	
	}
}
