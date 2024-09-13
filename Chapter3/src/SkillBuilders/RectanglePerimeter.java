package SkillBuilders;

import java.util.*;

public class RectanglePerimeter 
{

	public static void main(String[] args) 
	{
		
		Scanner userInput = new Scanner(System.in);
		
		System.out.print("Enter length of rectangle: ");
		int length = userInput.nextInt();
		
		System.out.print("Enter width of rectangle: ");
		int width = userInput.nextInt();
		
		int perimeter = length * 2 + width * 2;

		System.out.print("The are of the rectangle is: " + perimeter);
	}

}