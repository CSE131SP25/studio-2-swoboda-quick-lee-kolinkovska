package studio2;

import java.util.Scanner;

public class Ruin {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		//Variables
		double startAmount = 0.0;	
		double winChance = 0.0;
		double winLimit = 0.0;
		double currentAmount = 0.0;
		double randomNumber = Math.random();
		
		// Part 2
		int totalSimulations = 0;
		
		int totalWins = 0;
		int totalLoss = 0;

	
	System.out.print("Type your starting amount here:");
	startAmount = in.nextDouble();
	System.out.print("Enter Win Chance:");
	winChance = in.nextDouble();
	System.out.print("Enter your Win Limit:");
	winLimit = in.nextDouble();
	System.out.print("How many days do u wanna play: ");
	totalSimulations = in.nextInt();

	
	
    for (int i = 1; i <= totalSimulations; i++) {
    	//Each day
		System.out.println("Day: #" + i);
		totalWins = 0;
		totalLoss = 0;
		//Each play
		while ((currentAmount < winLimit) && (currentAmount > 0)){
			System.out.print("Current balance: " + startAmount);
		
			if (randomNumber < winChance) {
			    currentAmount = currentAmount + 1;
				randomNumber = Math.random();
				totalWins = totalWins + 1;
		
			} 
			else {
			    startAmount = startAmount - 1;
				randomNumber = Math.random();
				totalLoss = totalLoss + 1;

				
	}
			//End of each day
			System.out.println("");
			if (totalWins > totalLoss) {
				System.out.println("Day won");
			}
			else 
				System.out.println("Day ruined");
		}
			System.out.println("You lost this many times: " + totalLoss);
			System.out.println("You won this many times: " + totalWins);
			int totalPlays = totalWins + totalLoss;;
			System.out.println("You played this many times: " + totalPlays);
			System.out.println("");

					


	}

}
}


