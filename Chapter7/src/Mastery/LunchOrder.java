package Mastery;

public class LunchOrder {

	 Double price;
	 int fat;
	 int carb;
	 int fiber;
	
	LunchOrder(Double price, int fat, int carb, int fiber){
		
		this.price = price;
		this.fat = fat;
		this.carb = carb;
		this.fiber = fiber;
			
	}
	
	
	void Hamburger() {
		System.out.println("Each hamburger has " + this.fat + "g of fat, " + this.carb + "g of carbs, and " + this.fiber + "g of fiber.");
	}
	
	
	void Salad() {
		System.out.println("Each salad has " + this.fat + "g of fat, " + this.carb + "g of carbs, and " + this.fiber + "g of fiber.");
	}
	
	
	void FrenchFries() {
		System.out.println("French fries have " + this.fat + "g of fat, " + this.carb + "g of carbs, and " + this.fiber + "g of fiber.");
	}
	
	
	void Soda() {
		System.out.println("Each soda has " + this.fat + "g of fat, " + this.carb + "g of carbs, and " + this.fiber + "g of fiber.");
	}
	
}