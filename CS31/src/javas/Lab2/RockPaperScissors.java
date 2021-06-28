package javas.Lab2;

import java.util.Random;

import java.util.Scanner;

public class RockPaperScissors {

	// Defines scanner.
	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {

		// Continues as long as user wants.
		while (true) {
			char user = selection();
			char computer = CP();
			winCondition(user, computer);
			char ch = Repeat();

			if (ch == 'y' || ch == 'Y')
				continue;
			else
				break;
		}

	}

	// Tests to see if user wants to play again.
	private static char Repeat() {
		System.out.print("Do you want to Play again (Y/N)? ");
		char ch = s.next(".").charAt(0);
		return ch;
	}

	private static void winCondition(char user, char computer) {

		// Initializes winner.
		String winner = "";

		// Tests all possible win cases for user and CPU.
		if (user == 'r' && computer == 's') {
			winner = "Rock versus Scissors. You win!";
		}

		else if (user == 's' && computer == 'r') {
			winner = "Scissors versus Rock. You Lose!";
		}

		else if (user == 'r' && computer == 'p') {
			winner = "Rock versus Paper. You Lose!";
		}

		else if (user == 'p' && computer == 'r') {
			winner = "Paper versus Rock. You Win!";
		}

		else if (user == 'p' && computer == 's') {
			winner = "Paper versus Scissors. You lose!";
		}

		else if (user == 's' && computer == 'p') {
			winner = "Scissors versus Paper. You Win!";
		}

		// Tests for ties.
		else {
			
			if (user == 'r' && computer == 'r') {
				winner = "Rock versus Rock...Tie!";
			}

			else if (user == 'p' && computer == 'p') {
				winner = "Paper versus Paper...Tie!";
			}

			else if (user == 's' && computer == 's') {
				winner = "Scissors versus Scissors...Tie!";
			}
		}

		// Returns winner.
		System.out.println(winner);
	}

	// Creates CPU's choice.
	private static char CP() {

		char comp = 0;
		Random r = new Random();
		int num = r.nextInt((3 - 1) + 1) + 1;

		if (num == 1)
			comp = 'r';

		else if (num == 2)
			comp = 'p';

		else if (num == 3)
			comp = 's';

		return comp;
	}

	// Creates user's choice.
	private static char selection() {
		char userChoice;

		while (true) {

			System.out.print("Enter Choice: 'r' for Rock, 'p' for Paper, 's' for Scissors: ");
			userChoice = s.next(".").charAt(0);

			if (userChoice != 'r' && userChoice != 'p' && userChoice != 's') {
				System.out.print("Invalid. ");
				continue;
			}

			else
				break;
		}
		return userChoice;

	}
}
