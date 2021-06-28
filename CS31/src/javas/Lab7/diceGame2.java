package javas.Lab7;

import java.util.*;

public class diceGame2 {

	public static void main(String[] args) {
		// Calls dice method.
		dice();
	}

	public static void dice() {
		
		// Initializes Die Class objects for the computer and player.
		Die compDie = new Die();
		Die playerDie = new Die();

		// Initializes win counter and prints table header.
		int playerWin = 0;
		int compWin = 0;

		System.out.println("PLAYER | COMPUTER");

		// Initializes the player's rolled number and the computer's rolled number
		int player;
		int computer;

		// Loops 10 times.
		for (int i = 0; i < 10; i++) {

			// Sets the numbers equal to the Dice roll from the Die class.
			player = playerDie.roll();
			computer = compDie.roll();

			// Prints out rolled values.
			System.out.println("     " + player + "   " + computer);

			// Tests to see who wins.
			if (player > computer)
				playerWin++;
			else if (computer > player)
				compWin++;
		}

		// Returns output.
		if (compWin > playerWin)
			System.out.println("THE COMPUTER WINS! SCORE: " + compWin);
		else if (playerWin > compWin)
			System.out.println("THE PLAYER WINS! SCORE: " + playerWin);
		else
			System.out.println("TIE! SCORE: " + compWin);

	}
}
