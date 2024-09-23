package Mastery;

import java.util.Scanner;
import java.text.DecimalFormat;

public class ElectionMastery {

	public static DecimalFormat round = new DecimalFormat("0.00");
	
	public static void main(String[] args) {
		
		Scanner userInput = new Scanner(System.in);
		
		System.out.println("Election Results for New York:");
		System.out.print("Awbrey: ");
		int NYA = userInput.nextInt();
		System.out.print("Martinez: ");
		int NYM = userInput.nextInt();
		
		System.out.println("\nElection Results for New Jersey:");
		System.out.print("Awbrey: ");
		int NJA = userInput.nextInt();
		System.out.print("Martinez: ");
		int NJM = userInput.nextInt();
		
		
		System.out.println("\nElection Results for Connecticut:");
		System.out.print("Awbrey: ");
		int CA = userInput.nextInt();
		System.out.print("Martinez: ");
		int CM = userInput.nextInt();
		
		int totalVotesA = NYA + NJA + CA;
		int totalVotesM = NYM + NJM + CM;
		int totalVotesTotal = totalVotesA + totalVotesM;
		
		double votesAprcnt = ( (double) totalVotesA / totalVotesTotal) * 100;
		double votesMprcnt = ( (double) totalVotesM / totalVotesTotal) * 100;
		
		System.out.println("\nCandidate       Votes     Percentage");
		System.out.println("Awbrey          " + totalVotesA  + "       " +  round.format(votesAprcnt) + "%");
		System.out.println("Martinez        " + totalVotesM  + "       " +  round.format(votesMprcnt) + "%");
		System.out.println("TOTAL VOTES:    " + totalVotesTotal);
	}

}