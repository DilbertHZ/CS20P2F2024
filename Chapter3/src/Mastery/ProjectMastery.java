package Mastery;

import java.util.Scanner;
import java.text.DecimalFormat;

public class ProjectMastery {

	public static DecimalFormat round = new DecimalFormat("0.00");
	
	public static void main(String[] args) {
		
		Scanner userInput = new Scanner(System.in);
		
		System.out.print("Designing: ");
		int design = userInput.nextInt();
		
		System.out.print("Coding: ");
		int code = userInput.nextInt();
		
		System.out.print("Debugging: ");
		int debug = userInput.nextInt();
		
		System.out.print("Testing: ");
		int test = userInput.nextInt();
		
		int totalTime = design + code + debug + test;
		
		double designprcnt = ( (double) design / (totalTime)) * 100;
		double codeprcnt = ( (double) code / (totalTime)) * 100;	
		double debugprcnt = ( (double) debug / (totalTime)) * 100;	
		double testprcnt = ( (double) test / (totalTime)) * 100;
		
		System.out.println("\nTotal time spent: " + totalTime + " minutes.");
		System.out.println("\nTask        % Time");
		System.out.println("Designing   " + round.format(designprcnt) + "%");
		System.out.println("Coding      " + round.format(codeprcnt) + "%");
		System.out.println("Debugging   " + round.format(debugprcnt) + "%");
		System.out.print("Testing     " + round.format(testprcnt) + "%");
	}

}
