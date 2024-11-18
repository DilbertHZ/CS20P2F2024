package SkillBuilders;

public class Circle {
	
	private double rad;
	private static double pi = 3.14;
	
	public Circle() {
		rad = 1;
	}
	
	public Circle(double r) {
		rad = r;
	}
	
	public double circumference() {
		double circ;
		
		circ = pi * 2 * rad;
		
		return circ;
	}
	
	public double getRad() {
		return rad;
	}

	public void setRad(double r) {
		rad = r;
	}
	
	public static void displayAreaFormula() {
		System.out.println("The formula for the area of a circle is a = Pi * r ^ 2");
	}
	
	public boolean equals(Object c1) {
		Circle testObj = (Circle)c1;
		
		if (testObj.getRad() == rad) {
			return(true);
		} else {
			return(false);
		}
	}
	
	public String toString() {
		String circ;
		
		circ = "Circ has a radius of: " + rad;
		
		return(circ);
	}
	

}


