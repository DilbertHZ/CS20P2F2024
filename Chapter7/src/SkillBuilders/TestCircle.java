package SkillBuilders;

public class TestCircle {

	public static void main(String[] args) {
		Circle c1 = new Circle(0);
		Circle c2 = new Circle(0);
		
		c1.setRad(1);
		c2.setRad(2);
		
		System.out.println("Circle radius: " + c1.getRad());
		System.out.println("Circle area: " + c1.circumference());
		
		Circle.displayAreaFormula();
		
		if (c1.equals(c2)) {
			System.out.println("Objects are equal.");
		} else {
			System.out.println("Objects aren't equal.");
		}
		
		System.out.println(c1);
		System.out.println(c2);
	}

}
