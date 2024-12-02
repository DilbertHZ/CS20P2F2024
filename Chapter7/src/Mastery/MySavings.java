package Mastery;

public class MySavings {
	
	//Creates public variable which represents the total value in the piggybank
	private static double totalValue = 0;

	public static void PiggyBank(int input) {
		//Switch statement depending on user input
		switch (input) {
		//Breaks switch
		case 0: 
			break;
		case 1: 
			//Prints total value in piggybank
			System.out.println("You have " + totalValue + " in your piggybank.");
			break;
		case 2: 
			//Adds 1 cent to the piggybank
			totalValue += 0.01; 
			break;
		case 3:
			//Adds 5 cents to the piggybank
			totalValue += 0.05;
			break;
		case 4:
			//Adds 10 cents to the piggybank
			totalValue += 0.1;
			break;
		case 5:
			//Adds 25 cents to the piggybank
			totalValue += 0.25;
			break;
		case 6:
			//Removes all coins from the piggybank
			totalValue = 0;
			break;
		}
	}

}