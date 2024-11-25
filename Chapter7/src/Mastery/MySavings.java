package Mastery;

public class MySavings {
	
	public static double totalValue;

	public static void PiggyBank(int x) {
		switch (x) {
		case 0: 
			break;
		case 1: 
			System.out.println("You have " + totalValue + " in your piggybank.");
		case 2: 
			totalValue += 0.01;
		case 3:
			totalValue += 0.05;
		case 4:
			totalValue += 0.1;
		case 5:
			totalValue += 0.25;
		case 6:
			totalValue = 0;
		}
	}

	public static void x(int nextInt) {
		// TODO Auto-generated method stub
		
	}


}
