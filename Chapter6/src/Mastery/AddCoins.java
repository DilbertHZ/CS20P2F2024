package Mastery;

import java.util.Scanner;

public class AddCoins {

	public static void getDollarAmount(int pennyAmount, int nickleAmount, int dimeAmount, int quarterAmount) {
		
		//Declaration
		double pennyVaulue, nickleVaulue, dimeVaulue, quarterVaulue, totalValue;
		
		//Calculate value of coins
		pennyVaulue = (pennyAmount * 0.01);
		nickleVaulue = (nickleAmount * 0.05);
		dimeVaulue = (dimeAmount * 0.1);
		quarterVaulue = (quarterAmount * 0.25);
		
		totalValue = (pennyVaulue + nickleVaulue + dimeVaulue + quarterVaulue);
		
		//Print total value of coins
		System.out.print("$" + totalValue);
	}
	
	public static void main(String[] args) {
		
		//Declaration
		int pennyAmount, nickleAmount, dimeAmount, quarterAmount;
						
		//Preparing for user input
		Scanner userInput = new Scanner(System.in);
						
		//Prompt and record user input
		System.out.print("Enter number of pennies: ");
		pennyAmount = userInput.nextInt();
		System.out.print("Enter number of nickles: ");
		nickleAmount = userInput.nextInt();
		System.out.print("Enter number of dimes: ");
		dimeAmount = userInput.nextInt();
		System.out.print("Enter number of quarters: ");
		quarterAmount = userInput.nextInt();
		
		//Calls getDollarAmount method
		getDollarAmount(quarterAmount, quarterAmount, quarterAmount, quarterAmount);
		
	}

}

/*Screen Dump

Test Case 1:
Enter number of pennies: 6
Enter number of nickles: 5
Enter number of dimes: 1
Enter number of quarters: 3
$1.23

*/
