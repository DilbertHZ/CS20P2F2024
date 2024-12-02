/* Program: LunchOrder.java          Last Date of this Revision: November 29, 2024

Purpose: An application that displays the nutritional information about available foods, and totals the price depending on the number of dishes ordered.

Author: Hunter Zahn, 
School: CHHS
Course: Computer Programming 20
*/

package Mastery;

public class LunchOrder {

	//Declares variables
	 Double price;
	 int fat;
	 int carb;
	 int fiber;
	
	//
	LunchOrder(Double price, int fat, int carb, int fiber){
		
		this.price = price;
		this.fat = fat;
		this.carb = carb;
		this.fiber = fiber;
			
	}
	
	//Hamburger method to display its macros
	void Hamburger() {
		System.out.println("Each hamburger has " + this.fat + "g of fat, " + this.carb + "g of carbs, and " + this.fiber + "g of fiber.");
	}
	
	//Salad method to display its macros
	void Salad() {
		System.out.println("Each salad has " + this.fat + "g of fat, " + this.carb + "g of carbs, and " + this.fiber + "g of fiber.");
	}
	
	//FrenchFries method to display its macros
	void FrenchFries() {
		System.out.println("French fries have " + this.fat + "g of fat, " + this.carb + "g of carbs, and " + this.fiber + "g of fiber.");
	}
	
	//Soda method to display its macros
	void Soda() {
		System.out.println("Each soda has " + this.fat + "g of fat, " + this.carb + "g of carbs, and " + this.fiber + "g of fiber.");
	}
	
}