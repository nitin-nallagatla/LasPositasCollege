package javas.Lab7;

import java.lang.Math;

public class diceGame {

	public static void main(String[] args) {
		diceGame();
	}

	public static void diceGame() {

		// Initializes win counter and prints table header.
		int playerWins = 0;
		int cpuWins = 0;
		
		System.out.println("PLAYER | COMPUTER");

		// For loop generates numbers and prints them, and the calculates winner.
		for (int i = 0; i < 10; i++) {

			int cpuDice = (int)((Math.random() * 6) + 1);
			cpuDice = (int)cpuDice;

			int playerDice = (int)((Math.random() * 6) + 1);
			playerDice = playerDice;
			
			System.out.println("     " + playerDice + "   " + cpuDice);

			if (playerDice > cpuDice)
				playerWins++;
			else if (cpuDice > playerDice)
				cpuWins++;
		}

		winner(playerWins, cpuWins);

	}

	// Figures out which variable is bigger and returns the result.
	public static void winner(int playerWins, int cpuWins) {

		if (playerWins > cpuWins)
			System.out.println("THE PLAYER WINS! SCORE: " + playerWins);
		else if (cpuWins > playerWins)
			System.out.println("THE CPU WINS! SCORE: " + cpuWins);
		else
			System.out.println("TIE! SCORES: " + playerWins);
	}

}
